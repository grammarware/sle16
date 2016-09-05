package norswap.autumn.extensions.tokens

/**
 * If multiple token types can match at an input position, how to select the correct token type.
*/
enum class TokenDisambiguation
{
    /**
     * Select the correct token type by placing all token type syntax in an ordered
     * choice ([Choice]), in order of declaration.
     */
    ORDERING,

    /**
     * Select the correct token type by longest-match ([Longest]) (tie-breaking by order of
     * declaration: earliest takes precedence).
     */
    LONGEST_MATCH
}
