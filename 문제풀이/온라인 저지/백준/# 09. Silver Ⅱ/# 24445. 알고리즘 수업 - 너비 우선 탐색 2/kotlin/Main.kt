import java.util.*

fun main() {
    val n = i()
    val c = IntArray(n + 1)
    val g = Array(n + 1) { ArrayList<Int>() }

    var m = i()
    val q = IntArray(m+1)
    q[1] = i()
    var f = 0
    val cap = m
    var r = 1
    var s = 1

    var o = 0

    var a: Int
    var b: Int
    while (m-- > 0) {
        a = i()
        b = i()
        g[a].add(b)
        g[b].add(a)
    }
    for (i in 1..n) if (!g[i].isEmpty()) Collections.sort(g[i])

    var x: Int
    while (s != 0) {
        s--
        x = q[((f + 1 + cap) % cap).also { f = it }]
        if (c[x] > 0) continue
        c[x] = ++o
        for (i in g[x].size -1 downTo 0) {
            if (c[g[x][i]] == 0) {
                q[((r++) + 1 + cap) % cap] = g[x][i]
                s ++
            }
        }
    }
    val sb = StringBuilder()
    for (i in 1..n) {
        sb.append(c[i]).append('\n')
    }
    print(sb)
}

private const val S = 65536
private val iS = java.io.DataInputStream(System.`in`)
private val b = ByteArray(S)
private var c = 0
private var l = 0

private fun i(): Int {
    var v = 0
    var c = r()
    do v = v * 10 + c - 48 while (r().also { c = it } > 47)
    return v
}

private fun r(): Byte {
    if (c == l) {
        l = iS.read(b, 0.also { c = it }, S)
        if (l == -1) b[0] = -1
    }
    return b[c++]
}