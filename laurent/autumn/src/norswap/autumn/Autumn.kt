package norswap.autumn
import norswap.autumn.extensions.tokens.TokenGrammar

/**
 * Controls the debug mode. Applies to all [Context]s.
 * Within this mode, more information is recorded
 * (e.g. [Parser.lineage], [DebugFailure], [Context.debugTraceBeforeHook]).
 */
var DEBUG = false

/**
 * If true, [trace] shows three locations:
 *
 * 1. the location where the parser is defined
 * 2. the location where it is instantiated
 * 3. the location where the parser is used within the grammar
 *
 * Otherwise, only (3) is shown if [DEBUG], else only (2).
 */
var SHOW_EXTRA_LOCATIONS = false

/**
 * If true, hides all parser below the token level in traces ([trace]) when using a
 * [TokenGrammar].
 */
var HIDE_TOKENS_IN_TRACE: Boolean = true

/**
 * Size of tabs, used to display text positions.
 */
var TAB_SIZE = 4