package signature

import java.io.File

fun main() {
    println("Enter the first and last name:")
    val name = readLine()!!
    //val name = "Mr Anonimous"
    println("Enter the person's status:")
    val status = readLine()!!.lowercase()
    //val status = "Participant".lowercase()
    val fontMedium =
        "D:\\Programming\\HyperSkill\\ASCII Text Signature\\ASCII Text Signature\\task\\src\\signature\\medium.txt"
    val fontRoman = "D:/Programming/HyperSkill/ASCII Text Signature/ASCII Text Signature/task/src/signature/roman.txt"

    val letter1 =
        "____ ___  ____ ___  ____ ____ ____ _  _ _  _ _  _ _    _  _ _  _ ____ ___  ____ ____ ____ ___ _  _ _  _ _ _ _ _  _ _   _ ___ "
    val letter2 =
        "|__| |__] |    |  \\ |___ |___ | __ |__| |  | |_/  |    |\\/| |\\ | |  | |__] |  | |__/ [__   |  |  | |  | | | |  \\/   \\_/    / "
    val letter3 =
        "|  | |__] |___ |__/ |___ |    |__] |  | | _| | \\_ |___ |  | | \\| |__| |    |_\\| |  \\ ___]  |  |__|  \\/  |_|_| _/\\_   |    /__"

    val abc = mutableListOf(letter1, letter2, letter3)
    val stringName = mutableListOf<String>()
    val string = mutableListOf<String>("", "", "", "", "", "", "", "", "", "")
    //for (x in fontRoman) {
    var string1 = ""
    var string2 = ""
    var string3 = ""
    var string4 = ""
    var string5 = ""
    var string6 = ""
    var string7 = ""
    var string8 = ""
    var string9 = ""
    var string10 = ""
    for (i in name) {
        var x = 0
        var count = 0
        when (i) {
            'a' -> {
                File(fontRoman).forEachLine {
                    count++
//                        if (count in 3..12) {
//                            for (i in 0..9) {
//                                string[i] += it
//                                println(i)
//                                println(string[i])
//                            }
//                        }
                    if (count == 3) string1 += it
                    if (count == 4) string2 += it
                    if (count == 5) string3 += it
                    if (count == 6) string4 += it
                    if (count == 7) string5 += it
                    if (count == 8) string6 += it
                    if (count == 9) string7 += it
                    if (count == 10) string8 += it
                    if (count == 11) string9 += it
                    if (count == 12) string10 += it

                }
            }
            'b' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        14 -> string1 += it
                        15 -> string2 += it
                        16 -> string3 += it
                        17 -> string4 += it
                        18 -> string5 += it
                        19 -> string6 += it
                        20 -> string7 += it
                        21 -> string8 += it
                        22 -> string9 += it
                        23 -> string10 += it
                    }
                }
            }
            'c' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        25 -> string1 += it
                        26 -> string2 += it
                        27 -> string3 += it
                        28 -> string4 += it
                        29 -> string5 += it
                        30 -> string6 += it
                        31 -> string7 += it
                        32 -> string8 += it
                        33 -> string9 += it
                        34 -> string10 += it
                    }
                }
            }
            'd' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        36 -> string1 += it
                        37 -> string2 += it
                        38 -> string3 += it
                        39 -> string4 += it
                        40 -> string5 += it
                        41 -> string6 += it
                        42 -> string7 += it
                        43 -> string8 += it
                        44 -> string9 += it
                        45 -> string10 += it
                    }
                }
            }
            'e' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        47 -> string1 += it
                        48 -> string2 += it
                        49 -> string3 += it
                        50 -> string4 += it
                        51 -> string5 += it
                        52 -> string6 += it
                        53 -> string7 += it
                        54 -> string8 += it
                        55 -> string9 += it
                        56 -> string10 += it
                    }
                }
            }
            'f' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        58 -> string1 += it
                        59 -> string2 += it
                        60 -> string3 += it
                        61 -> string4 += it
                        62 -> string5 += it
                        63 -> string6 += it
                        64 -> string7 += it
                        65 -> string8 += it
                        66 -> string9 += it
                        67 -> string10 += it
                    }
                }
            }
            'g' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        69 -> string1 += it
                        70 -> string2 += it
                        71 -> string3 += it
                        72 -> string4 += it
                        73 -> string5 += it
                        74 -> string6 += it
                        75 -> string7 += it
                        76 -> string8 += it
                        77 -> string9 += it
                        78 -> string10 += it
                    }
                }
            }
            'h' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        80 -> string1 += it
                        81 -> string2 += it
                        82 -> string3 += it
                        83 -> string4 += it
                        84 -> string5 += it
                        85 -> string6 += it
                        86 -> string7 += it
                        87 -> string8 += it
                        88 -> string9 += it
                        89 -> string10 += it
                    }
                }
            }
            'i' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        91 -> string1 += it
                        92 -> string2 += it
                        93 -> string3 += it
                        94 -> string4 += it
                        95 -> string5 += it
                        96 -> string6 += it
                        97 -> string7 += it
                        98 -> string8 += it
                        99 -> string9 += it
                        100 -> string10 += it
                    }
                }
            }
            'j' -> {
                File(fontRoman).forEachLine {
                    count++
                    if (count == 102) string1 += it
                    if (count == 103) string2 += it
                    if (count == 104) string3 += it
                    if (count == 105) string4 += it
                    if (count == 106) string5 += it
                    if (count == 107) string6 += it
                    if (count == 108) string7 += it
                    if (count == 109) string8 += it
                    if (count == 110) string9 += it
                    if (count == 111) string10 += it
                }
            }
            'k' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        113 -> string1 += it
                        114 -> string2 += it
                        115 -> string3 += it
                        116 -> string4 += it
                        117 -> string5 += it
                        118 -> string6 += it
                        119 -> string7 += it
                        120 -> string8 += it
                        121 -> string9 += it
                        122 -> string10 += it
                    }
                }
            }
            'l' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        124 -> string1 += it
                        125 -> string2 += it
                        126 -> string3 += it
                        127 -> string4 += it
                        128 -> string5 += it
                        129 -> string6 += it
                        130 -> string7 += it
                        131 -> string8 += it
                        132 -> string9 += it
                        133 -> string10 += it
                    }
                }
            }
            'm' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        135 -> string1 += it
                        136 -> string2 += it
                        137 -> string3 += it
                        138 -> string4 += it
                        139 -> string5 += it
                        140 -> string6 += it
                        141 -> string7 += it
                        142 -> string8 += it
                        143 -> string9 += it
                        144 -> string10 += it
                    }
                }
            }
            'n' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        146 -> string1 += it
                        147 -> string2 += it
                        148 -> string3 += it
                        149 -> string4 += it
                        150 -> string5 += it
                        151 -> string6 += it
                        152 -> string7 += it
                        153 -> string8 += it
                        154 -> string9 += it
                        155 -> string10 += it
                    }
                }
            }
            'o' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        157 -> string1 += it
                        158 -> string2 += it
                        159 -> string3 += it
                        160 -> string4 += it
                        161 -> string5 += it
                        162 -> string6 += it
                        163 -> string7 += it
                        164 -> string8 += it
                        165 -> string9 += it
                        166 -> string10 += it
                    }
                }
            }
            'p' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        168 -> string1 += it
                        169 -> string2 += it
                        170 -> string3 += it
                        171 -> string4 += it
                        172 -> string5 += it
                        173 -> string6 += it
                        174 -> string7 += it
                        175 -> string8 += it
                        176 -> string9 += it
                        177 -> string10 += it
                    }
                }
            }
            'q' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        179 -> string1 += it
                        180 -> string2 += it
                        181 -> string3 += it
                        182 -> string4 += it
                        183 -> string5 += it
                        184 -> string6 += it
                        185 -> string7 += it
                        186 -> string8 += it
                        187 -> string9 += it
                        188 -> string10 += it
                    }
                }
            }
            'r' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        190 -> string1 += it
                        191 -> string2 += it
                        192 -> string3 += it
                        193 -> string4 += it
                        194 -> string5 += it
                        195 -> string6 += it
                        196 -> string7 += it
                        197 -> string8 += it
                        198 -> string9 += it
                        199 -> string10 += it
                    }
                }
            }
            's' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        201 -> string1 += it
                        202 -> string2 += it
                        203 -> string3 += it
                        204 -> string4 += it
                        205 -> string5 += it
                        206 -> string6 += it
                        207 -> string7 += it
                        208 -> string8 += it
                        209 -> string9 += it
                        210 -> string10 += it
                    }
                }
            }
            't' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        212 -> string1 += it
                        213 -> string2 += it
                        214 -> string3 += it
                        215 -> string4 += it
                        216 -> string5 += it
                        217 -> string6 += it
                        218 -> string7 += it
                        219 -> string8 += it
                        220 -> string9 += it
                        221 -> string10 += it
                    }
                }
            }
            'u' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        223 -> string1 += it
                        224 -> string2 += it
                        225 -> string3 += it
                        226 -> string4 += it
                        227 -> string5 += it
                        228 -> string6 += it
                        229 -> string7 += it
                        230 -> string8 += it
                        231 -> string9 += it
                        232 -> string10 += it
                    }
                }
            }
            'v' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        234 -> string1 += it
                        235 -> string2 += it
                        236 -> string3 += it
                        237 -> string4 += it
                        238 -> string5 += it
                        239 -> string6 += it
                        240 -> string7 += it
                        241 -> string8 += it
                        242 -> string9 += it
                        243 -> string10 += it
                    }
                }
            }
            'w' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        245 -> string1 += it
                        246 -> string2 += it
                        247 -> string3 += it
                        248 -> string4 += it
                        249 -> string5 += it
                        250 -> string6 += it
                        251 -> string7 += it
                        252 -> string8 += it
                        253 -> string9 += it
                        254 -> string10 += it
                    }
                }
            }
            'x' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        256 -> string1 += it
                        257 -> string2 += it
                        258 -> string3 += it
                        259 -> string4 += it
                        260 -> string5 += it
                        261 -> string6 += it
                        262 -> string7 += it
                        263 -> string8 += it
                        264 -> string9 += it
                        265 -> string10 += it
                    }
                }
            }
            'y' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        267 -> string1 += it
                        268 -> string2 += it
                        269 -> string3 += it
                        270 -> string4 += it
                        271 -> string5 += it
                        272 -> string6 += it
                        273 -> string7 += it
                        274 -> string8 += it
                        275 -> string9 += it
                        276 -> string10 += it
                    }
                }
            }
            'z' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        278 -> string1 += it
                        279 -> string2 += it
                        280 -> string3 += it
                        281 -> string4 += it
                        282 -> string5 += it
                        283 -> string6 += it
                        284 -> string7 += it
                        285 -> string8 += it
                        286 -> string9 += it
                        287 -> string10 += it
                    }
                }
            }

            'A' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        289 -> string1 += it
                        290 -> string2 += it
                        291 -> string3 += it
                        292 -> string4 += it
                        293 -> string5 += it
                        294 -> string6 += it
                        295 -> string7 += it
                        296 -> string8 += it
                        297 -> string9 += it
                        298 -> string10 += it
                    }
                }
            }
            'B' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        300 -> string1 += it
                        301 -> string2 += it
                        302 -> string3 += it
                        303 -> string4 += it
                        304 -> string5 += it
                        305 -> string6 += it
                        306 -> string7 += it
                        307 -> string8 += it
                        308 -> string9 += it
                        309 -> string10 += it
                    }
                }
            }
            'C' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        311 -> string1 += it
                        312 -> string2 += it
                        313 -> string3 += it
                        314 -> string4 += it
                        315 -> string5 += it
                        316 -> string6 += it
                        317 -> string7 += it
                        318 -> string8 += it
                        319 -> string9 += it
                        320 -> string10 += it
                    }
                }
            }
            'D' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        322 -> string1 += it
                        323 -> string2 += it
                        324 -> string3 += it
                        325 -> string4 += it
                        326 -> string5 += it
                        327 -> string6 += it
                        328 -> string7 += it
                        329 -> string8 += it
                        330 -> string9 += it
                        331 -> string10 += it
                    }
                }
            }
            'E' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        333 -> string1 += it
                        334 -> string2 += it
                        335 -> string3 += it
                        336 -> string4 += it
                        337 -> string5 += it
                        338 -> string6 += it
                        339 -> string7 += it
                        340 -> string8 += it
                        341 -> string9 += it
                        342 -> string10 += it
                    }
                }
            }
            'F' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        344 -> string1 += it
                        345 -> string2 += it
                        346 -> string3 += it
                        347 -> string4 += it
                        348 -> string5 += it
                        349 -> string6 += it
                        350 -> string7 += it
                        351 -> string8 += it
                        352 -> string9 += it
                        353 -> string10 += it
                    }
                }
            }
            'G' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        355 -> string1 += it
                        356 -> string2 += it
                        357 -> string3 += it
                        358 -> string4 += it
                        359 -> string5 += it
                        360 -> string6 += it
                        361 -> string7 += it
                        362 -> string8 += it
                        363 -> string9 += it
                        364 -> string10 += it
                    }
                }
            }
            'H' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        366 -> string1 += it
                        367 -> string2 += it
                        368 -> string3 += it
                        369 -> string4 += it
                        370 -> string5 += it
                        371 -> string6 += it
                        372 -> string7 += it
                        373 -> string8 += it
                        374 -> string9 += it
                        375 -> string10 += it
                    }
                }
            }
            'I' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        377 -> string1 += it
                        378 -> string2 += it
                        379 -> string3 += it
                        380 -> string4 += it
                        381 -> string5 += it
                        382 -> string6 += it
                        383 -> string7 += it
                        384 -> string8 += it
                        385 -> string9 += it
                        386 -> string10 += it
                    }
                }
            }
            'J' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        388 -> string1 += it
                        389 -> string2 += it
                        390 -> string3 += it
                        391 -> string4 += it
                        392 -> string5 += it
                        393 -> string6 += it
                        394 -> string7 += it
                        395 -> string8 += it
                        396 -> string9 += it
                        397 -> string10 += it
                    }
                }
            }
            'K' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        399 -> string1 += it
                        400 -> string2 += it
                        401 -> string3 += it
                        402 -> string4 += it
                        403 -> string5 += it
                        404 -> string6 += it
                        405 -> string7 += it
                        406 -> string8 += it
                        407 -> string9 += it
                        408 -> string10 += it
                    }
                }
            }
            'L' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        410 -> string1 += it
                        411 -> string2 += it
                        412 -> string3 += it
                        413 -> string4 += it
                        414 -> string5 += it
                        415 -> string6 += it
                        416 -> string7 += it
                        417 -> string8 += it
                        418 -> string9 += it
                        419 -> string10 += it
                    }
                }
            }
            'M' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        421 -> string1 += it
                        422 -> string2 += it
                        423 -> string3 += it
                        424 -> string4 += it
                        425 -> string5 += it
                        426 -> string6 += it
                        427 -> string7 += it
                        428 -> string8 += it
                        429 -> string9 += it
                        430 -> string10 += it
                    }
                }
            }
            'N' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        432 -> string1 += it
                        433 -> string2 += it
                        434 -> string3 += it
                        435 -> string4 += it
                        436 -> string5 += it
                        437 -> string6 += it
                        438 -> string7 += it
                        439 -> string8 += it
                        440 -> string9 += it
                        441 -> string10 += it
                    }
                }
            }
            'O' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        443 -> string1 += it
                        444 -> string2 += it
                        445 -> string3 += it
                        446 -> string4 += it
                        447 -> string5 += it
                        448 -> string6 += it
                        449 -> string7 += it
                        450 -> string8 += it
                        451 -> string9 += it
                        452 -> string10 += it
                    }
                }
            }
            'P' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        454 -> string1 += it
                        455 -> string2 += it
                        456 -> string3 += it
                        457 -> string4 += it
                        458 -> string5 += it
                        459 -> string6 += it
                        460 -> string7 += it
                        461 -> string8 += it
                        462 -> string9 += it
                        463 -> string10 += it
                    }
                }
            }
            'Q' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        465 -> string1 += it
                        466 -> string2 += it
                        467 -> string3 += it
                        468 -> string4 += it
                        469 -> string5 += it
                        470 -> string6 += it
                        471 -> string7 += it
                        472 -> string8 += it
                        473 -> string9 += it
                        474 -> string10 += it
                    }
                }
            }
            'R' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        476 -> string1 += it
                        477 -> string2 += it
                        478 -> string3 += it
                        479 -> string4 += it
                        480 -> string5 += it
                        481 -> string6 += it
                        482 -> string7 += it
                        483 -> string8 += it
                        484 -> string9 += it
                        485 -> string10 += it
                    }
                }
            }
            'S' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        487 -> string1 += it
                        488 -> string2 += it
                        489 -> string3 += it
                        490 -> string4 += it
                        491 -> string5 += it
                        492 -> string6 += it
                        493 -> string7 += it
                        494 -> string8 += it
                        495 -> string9 += it
                        496 -> string10 += it
                    }
                }
            }
            'T' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        498 -> string1 += it
                        499 -> string2 += it
                        500 -> string3 += it
                        501 -> string4 += it
                        502 -> string5 += it
                        503 -> string6 += it
                        504 -> string7 += it
                        505 -> string8 += it
                        506 -> string9 += it
                        507 -> string10 += it
                    }
                }
            }
            'U' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        509 -> string1 += it
                        510 -> string2 += it
                        511 -> string3 += it
                        512 -> string4 += it
                        513 -> string5 += it
                        514 -> string6 += it
                        515 -> string7 += it
                        516 -> string8 += it
                        517 -> string9 += it
                        518 -> string10 += it
                    }
                }
            }
            'V' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        520 -> string1 += it
                        521 -> string2 += it
                        522 -> string3 += it
                        523 -> string4 += it
                        524 -> string5 += it
                        525 -> string6 += it
                        526 -> string7 += it
                        527 -> string8 += it
                        528 -> string9 += it
                        529 -> string10 += it
                    }
                }
            }
            'W' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        531 -> string1 += it
                        532 -> string2 += it
                        533 -> string3 += it
                        534 -> string4 += it
                        535 -> string5 += it
                        536 -> string6 += it
                        537 -> string7 += it
                        538 -> string8 += it
                        539 -> string9 += it
                        540 -> string10 += it
                    }
                }
            }
            'X' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        542 -> string1 += it
                        543 -> string2 += it
                        544 -> string3 += it
                        545 -> string4 += it
                        546 -> string5 += it
                        547 -> string6 += it
                        548 -> string7 += it
                        549 -> string8 += it
                        550 -> string9 += it
                        551 -> string10 += it
                    }
                }
            }
            'Y' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        553 -> string1 += it
                        554 -> string2 += it
                        555 -> string3 += it
                        556 -> string4 += it
                        557 -> string5 += it
                        558 -> string6 += it
                        559 -> string7 += it
                        560 -> string8 += it
                        561 -> string9 += it
                        562 -> string10 += it
                    }
                }
            }
            'Z' -> {
                File(fontRoman).forEachLine {
                    count++
                    when (count) {
                        564 -> string1 += it
                        565 -> string2 += it
                        566 -> string3 += it
                        567 -> string4 += it
                        568 -> string5 += it
                        569 -> string6 += it
                        570 -> string7 += it
                        571 -> string8 += it
                        572 -> string9 += it
                        573 -> string10 += it
                    }
                }
            }

            ' ' -> {
                string1 += "          "
                string2 += "          "
                string3 += "          "
                string4 += "          "
                string5 += "          "
                string6 += "          "
                string7 += "          "
                string8 += "          "
                string9 += "          "
                string10 += "          "

            }


        }
    }
//    for (i in 0..9) {
//        stringName.add(string[i])
//        println(string[i])
//    }
    stringName.add(string1)
    stringName.add(string2)
    stringName.add(string3)
    stringName.add(string4)
    stringName.add(string5)
    stringName.add(string6)
    stringName.add(string7)
    stringName.add(string8)
    stringName.add(string9)
    stringName.add(string10)


    var totalStatus = mutableListOf<String>()
    for (x in abc) {
        var stringStatus = ""
        for (i in status) {
            when (i) {
                'a' -> stringStatus += x.substring(0, 4)
                'b' -> stringStatus += x.substring(5, 9)
                'c' -> stringStatus += x.substring(10, 14)
                'd' -> stringStatus += x.substring(15, 19)
                'e' -> stringStatus += x.substring(20, 24)
                'f' -> stringStatus += x.substring(25, 29)
                'g' -> stringStatus += x.substring(30, 34)
                'h' -> stringStatus += x.substring(35, 39)
                'i' -> stringStatus += x.substring(40, 41)
                'j' -> stringStatus += x.substring(42, 44)
                'k' -> stringStatus += x.substring(45, 49)
                'l' -> stringStatus += x.substring(50, 54)
                'm' -> stringStatus += x.substring(55, 59)
                'n' -> stringStatus += x.substring(60, 64)
                'o' -> stringStatus += x.substring(65, 69)
                'p' -> stringStatus += x.substring(70, 74)
                'q' -> stringStatus += x.substring(75, 79)
                'r' -> stringStatus += x.substring(80, 84)
                's' -> stringStatus += x.substring(85, 89)
                't' -> stringStatus += x.substring(90, 93)
                'u' -> stringStatus += x.substring(94, 98)
                'v' -> stringStatus += x.substring(99, 103)
                'w' -> stringStatus += x.substring(104, 109)
                'x' -> stringStatus += x.substring(110, 114)
                'y' -> stringStatus += x.substring(115, 120)
                'z' -> stringStatus += x.substring(121)
                ' ' -> stringStatus += "    "
            }
            stringStatus += " "
        }
        totalStatus.add(stringStatus)
    }


    var top = "8".repeat(stringName[0].length + 8)
    var bottom = "8".repeat(stringName[2].length + 8)

    fun longStatusEven() {
        for (i in stringName.indices) {
            print("88")
            print(" ".repeat((totalStatus[0].length + 6 - stringName[2].length) / 2 - 1))
            print(stringName[i])
            print(" ".repeat((totalStatus[0].length + 6) / 2 - stringName[2].length / 2 - 1))
            println("88")
        }
    }

    fun longStatusOdd() {
        for (i in stringName.indices) {
            print("88")
            print(" ".repeat((totalStatus[0].length + 4 - stringName[2].length) / 2))
            print(stringName[i])
            print(" ".repeat(totalStatus[0].length - (totalStatus[0].length - 6) / 2 - stringName[2].length / 2 - 1))
            println("88")
        }
    }

    if (stringName[0].length < totalStatus[0].length) {
        top = "8".repeat(totalStatus[0].length + 8)
        bottom = "8".repeat(totalStatus[0].length + 8)
        println(top)

        if ((totalStatus[0].length - stringName[2].length) % 2 == 0) {
            longStatusEven()
        } else {
            longStatusOdd()
        }

        print("88  ")
        print(totalStatus[0])
        println("  88")
        print("88  ")
        print(totalStatus[1])
        println("  88")
        print("88  ")
        print(totalStatus[2])
        println("  88")



        println(bottom)
    } else {
        println(top)
        for (i in stringName.indices) {
            print("88  ")
            print(stringName[i])
            println("  88")
        }


        if ((stringName[2].length + 5 - totalStatus[0].length) % 2 == 0) {
            print("88")
            print(" ".repeat((stringName[2].length + 5 - totalStatus[0].length) / 2 - 1))
            print(totalStatus[0])
            print(" ".repeat((stringName[2].length + 5) / 2 - totalStatus[0].length / 2))
            println("88")
            print("88")
            print(" ".repeat((stringName[2].length + 5 - totalStatus[0].length) / 2 - 1))
            print(totalStatus[1])
            print(" ".repeat((stringName[2].length + 5) / 2 - totalStatus[0].length / 2))
            println("88")
            print("88")
            print(" ".repeat((stringName[2].length + 5 - totalStatus[0].length) / 2 - 1))
            print(totalStatus[2])
            print(" ".repeat((stringName[2].length + 5) / 2 - totalStatus[0].length / 2))
            println("88")
        } else {
            print("88")
            print(" ".repeat((stringName[2].length + 6 - totalStatus[0].length) / 2 - 1))
            print(totalStatus[0])
            print(" ".repeat(stringName[2].length - (stringName[2].length - 5) / 2 - totalStatus[0].length / 2 - 1))
            println("88")
            print("88")
            print(" ".repeat((stringName[2].length + 6 - totalStatus[0].length) / 2 - 1))
            print(totalStatus[1])
            print(" ".repeat(stringName[2].length - (stringName[2].length - 5) / 2 - totalStatus[0].length / 2 - 1))
            println("88")
            print("88")
            print(" ".repeat((stringName[2].length + 6 - totalStatus[0].length) / 2 - 1))
            print(totalStatus[2])
            print(" ".repeat(stringName[2].length - (stringName[2].length - 5) / 2 - totalStatus[0].length / 2 - 1))
            println("88")
        }


        println(bottom)
    }
}