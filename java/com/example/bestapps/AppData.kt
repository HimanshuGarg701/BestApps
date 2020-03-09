package com.example.bestapps

class AppData {
    var name = ""
    var artist = ""
    var summary = ""
    var imageUrl = ""
    var dateReleased = ""

    override fun toString(): String {
        return """
            name : $name
            artist : $artist
            summary : $summary
            dateReleased : $dateReleased
        """.trimIndent()
    }
}