class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
    val map = HashMap<Char, Char>()
    val set = HashSet<Char>()
    for (i in s.indices) {
        val sc = s[i]
        val tc = t[i]
        if (map.containsKey(sc)) { // p
            if (map[sc] != tc) { // p 를 t 라고 매핑 했는데 아니면 false!!
                return false
            }
        } else {
            // 값이 중복됨. 매핑되지 않으므로 false
            if (set.contains(tc)) {
                return false
            }
            map[sc] = tc // p = t, a = i
            set.add(tc) // t, i
        }
    }

    return true
    }
}