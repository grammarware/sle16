package norswap.autumn.extensions.tokens
import norswap.autumn.Grammar
import norswap.autumn.Parser
import norswap.autumn.ParserBuilder
import norswap.autumn.parsers.Choice
import norswap.autumn.parsers.Longest
import norswap.autumn.parsers.OrFail
import norswap.autumn.parsers.Str

/**
 * Adds lexical analysis (tokenization) emulation to [Grammar].
 *
 * The basic rule is that at each input position, there is at most one token (i.e. any ambiguities
 * must be resolved at the lexical level). Users can register new token types with the [token]
 * function, which returns a parser.
 *
 * All parsers returned by [token] (type  [TokenCheckParser]) determine the type of token (if any)
 * present at the given input position. If multiple types of tokens could match, they ar
 * disambiguated through a [TokenDisambiguation] method. The parser then checks if the matched
 * token is of the required type. If so, it pushes a [Token] value onto [Context.stack].
 *
 * You can enable caching for tokens by passing a [TokenCache] to the [Context].
 */
abstract class TokenGrammar: Grammar()
{
    /// SETTINGS ///////////////////////////////////////////////////////////////////////////////////

    /**
     * If multiple token types can match at an input position, how to select the correct
     * token type.
     */
    open val tokenDisambiguation = TokenDisambiguation.ORDERING

    ////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * This it the parser that matches a single token (of any kind).
     */
    internal lateinit var tokenParser: Parser

    /**
     * The token type ID for the next token to be registered.
     */
    private var nextTokenType = 0

    /**
     * List of [TokenTypeParser] for each registered token, indexed by token type ID.
     */
    internal var typeParsers = mutableListOf<TokenTypeParser>()

    /**
     * List of [TokenCheckParser] for each registered token, indexed by token type ID.
     */
    internal var checkParsers = mutableListOf<TokenCheckParser>()

    // ---------------------------------------------------------------------------------------------

    override fun initialize() {
        super.initialize()
        val msg = "Could not match any token"
        val array = typeParsers.toTypedArray()

        tokenParser = when (tokenDisambiguation) {
            TokenDisambiguation.ORDERING -> OrFail(Choice(*array)) { failure(it) { msg } }
            TokenDisambiguation.LONGEST_MATCH -> OrFail(Longest(*array)) { failure(it) { msg } }
        }   }

    // ---------------------------------------------------------------------------------------------

    /**
     * Returns a parser for a token whose syntax is defined by this parser and whose value
     * is built by [value], a function that takes the string matched by this parser as parameter.
     *
     * !! Excepted for the position, no state manipulation is allowed inside a token parser.
     */
    fun <T: Any> ParserBuilder.token(info: Boolean = false, value: (String) -> T?): Parser
    {
        val parser = build()
        val type = nextTokenType ++
        val typeParser = TokenTypeParser(type, parser, value, this@TokenGrammar)
        val checkParser = TokenCheckParser(type, info, this@TokenGrammar)
        typeParsers.add(typeParser)
        checkParsers.add(checkParser)
        return checkParser
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Sugar for `this.token { it }`.
     */
    val ParserBuilder.token: Parser
        get() = token { it }

    /**
     * Sugar for `Str(this).token { null }`.
     */
    val String.keyword: Parser
        get() = Str(this).token { null }

    /**
     * Sugar for `Str(this).token { it }`.
     */
    val String.token: Parser
        get() = Str(this).token { it }

    // ---------------------------------------------------------------------------------------------

    fun parserName(type: Int): String
    {
        assert(type < checkParsers.size)
        return checkParsers[type].name
            ?: typeParsers[type].fullString()
    }
}
