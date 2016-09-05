package norswap.autumn

/**
 * Maps line numbers to their file offsets (the offset of the character following the newline
 * character) and allows the reverse mapping in O(log(number of lines)). Lines are indexed from 0.
 */
class LineMap (string: String, val lineOffset: Int = 1, val columnOffset: Int = 1)
{
    /**
     * An array such that `linePosition[i]` returns the index of the first character on line `i`.
     */
    val linePositions: IntArray

    init {
        val positions = mutableListOf(0)
        string.forEachIndexed { i, c -> if (c == '\n') positions.add(i + 1) }
        linePositions = positions.toIntArray()
    }

    /**
     * Returns the number of the line containing the given file offset.
     */
    fun lineFromOffset(offset: Int): Int {
        assert(offset >= 0)
        val line = linePositions.binarySearch(offset)
        // Either `offset` is the first char of the line,
        // or `-line - 1` == number of first line starting after `offset`
        return if (line >= 0) line else -line - 2
    }

    fun offsetFromLine(line: Int) = linePositions[line]

    fun offsetToString(pos: Int): String {
        val line = lineFromOffset(pos)
        return "line ${line + lineOffset} column ${pos - offsetFromLine(line) + columnOffset}"
    }

    fun offsetRangeToString(start: Int, end: Int): String {
        val l1 = lineFromOffset(start)
        val l2 = lineFromOffset(end)
        return if (l1 != l2) "${offsetToString(start)} to ${offsetToString(end)}"
        else {
            val coff = offsetFromLine(l1) - columnOffset
            "line ${l1 + lineOffset} column ${start - coff} to ${end - coff}"
        }
    }
}
