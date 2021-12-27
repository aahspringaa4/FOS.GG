package com.example.fifausersearchservice.feature.user

enum class Rank(name: String) {
    SUPER_CHAMPIONS("슈퍼 챔피언스"),
    CHAMPIONS("챔피언스"),
    SUPER_CHALLENGE("슈퍼 챌린지"),
    CHALLENGE1("챌린지1"),
    CHALLENGE2("챌린지2"),
    CHALLENGE3("챌린지3"),
    WORLD_CLASS1("월드클래스1"),
    WORLD_CLASS2("월드클래스2"),
    WORLD_CLASS3("월드클래스3"),
    PRO1("프로1"),
    PRO2("프로2"),
    PRO3("프로3"),
    SEMIPRO1("세미프로1"),
    SEMIPRO2("세미프로2"),
    SEMIPRO3("세미프로3"),
    ELEMENT1("유망주1"),
    ELEMENT2("유망주2"),
    ELEMENT3("유망주3"),
    NULL("")
}

fun Int.toRank(): Rank =
    when(this) {
        800 -> Rank.SUPER_CHAMPIONS

        900 ->  Rank.CHAMPIONS

        1000 -> Rank.SUPER_CHALLENGE

        1100 -> Rank.CHALLENGE1

        1200 -> Rank.CHALLENGE2

        1300 -> Rank.CHALLENGE3

        2000 -> Rank.WORLD_CLASS1

        2100 -> Rank.WORLD_CLASS2

        2200 -> Rank.WORLD_CLASS3

        2300 -> Rank.PRO1

        2400 -> Rank.PRO2

        2500 -> Rank.PRO3

        2600 -> Rank.SEMIPRO1

        2700 -> Rank.SEMIPRO2

        2800 -> Rank.SEMIPRO3

        2900 -> Rank.ELEMENT1

        3000 -> Rank.ELEMENT2

        3100 -> Rank.ELEMENT3
        else -> {
            Rank.NULL
        }
    }
