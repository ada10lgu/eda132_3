


(define (problem logistics-c50-s5-p5-a5)
(:domain logistics-strips)
(:objects a0 a1 a2 a3 a4 
          c0 c1 c2 c3 c4 c5 c6 c7 c8 c9 c10 c11 c12 c13 c14 c15 c16 c17 c18 c19 c20 c21 c22 c23 c24 c25 c26 c27 c28 c29 c30 c31 c32 c33 c34 c35 c36 c37 c38 c39 c40 c41 c42 c43 c44 c45 c46 c47 c48 c49 
          t0 t1 t2 t3 t4 t5 t6 t7 t8 t9 t10 t11 t12 t13 t14 t15 t16 t17 t18 t19 t20 t21 t22 t23 t24 t25 t26 t27 t28 t29 t30 t31 t32 t33 t34 t35 t36 t37 t38 t39 t40 t41 t42 t43 t44 t45 t46 t47 t48 t49 
          l00 l01 l02 l03 l04 l10 l11 l12 l13 l14 l20 l21 l22 l23 l24 l30 l31 l32 l33 l34 l40 l41 l42 l43 l44 l50 l51 l52 l53 l54 l60 l61 l62 l63 l64 l70 l71 l72 l73 l74 l80 l81 l82 l83 l84 l90 l91 l92 l93 l94 l100 l101 l102 l103 l104 l110 l111 l112 l113 l114 l120 l121 l122 l123 l124 l130 l131 l132 l133 l134 l140 l141 l142 l143 l144 l150 l151 l152 l153 l154 l160 l161 l162 l163 l164 l170 l171 l172 l173 l174 l180 l181 l182 l183 l184 l190 l191 l192 l193 l194 l200 l201 l202 l203 l204 l210 l211 l212 l213 l214 l220 l221 l222 l223 l224 l230 l231 l232 l233 l234 l240 l241 l242 l243 l244 l250 l251 l252 l253 l254 l260 l261 l262 l263 l264 l270 l271 l272 l273 l274 l280 l281 l282 l283 l284 l290 l291 l292 l293 l294 l300 l301 l302 l303 l304 l310 l311 l312 l313 l314 l320 l321 l322 l323 l324 l330 l331 l332 l333 l334 l340 l341 l342 l343 l344 l350 l351 l352 l353 l354 l360 l361 l362 l363 l364 l370 l371 l372 l373 l374 l380 l381 l382 l383 l384 l390 l391 l392 l393 l394 l400 l401 l402 l403 l404 l410 l411 l412 l413 l414 l420 l421 l422 l423 l424 l430 l431 l432 l433 l434 l440 l441 l442 l443 l444 l450 l451 l452 l453 l454 l460 l461 l462 l463 l464 l470 l471 l472 l473 l474 l480 l481 l482 l483 l484 l490 l491 l492 l493 l494 
          p0 p1 p2 p3 p4 
)
(:init
(AIRPLANE a0)
(AIRPLANE a1)
(AIRPLANE a2)
(AIRPLANE a3)
(AIRPLANE a4)
(CITY c0)
(CITY c1)
(CITY c2)
(CITY c3)
(CITY c4)
(CITY c5)
(CITY c6)
(CITY c7)
(CITY c8)
(CITY c9)
(CITY c10)
(CITY c11)
(CITY c12)
(CITY c13)
(CITY c14)
(CITY c15)
(CITY c16)
(CITY c17)
(CITY c18)
(CITY c19)
(CITY c20)
(CITY c21)
(CITY c22)
(CITY c23)
(CITY c24)
(CITY c25)
(CITY c26)
(CITY c27)
(CITY c28)
(CITY c29)
(CITY c30)
(CITY c31)
(CITY c32)
(CITY c33)
(CITY c34)
(CITY c35)
(CITY c36)
(CITY c37)
(CITY c38)
(CITY c39)
(CITY c40)
(CITY c41)
(CITY c42)
(CITY c43)
(CITY c44)
(CITY c45)
(CITY c46)
(CITY c47)
(CITY c48)
(CITY c49)
(TRUCK t0)
(TRUCK t1)
(TRUCK t2)
(TRUCK t3)
(TRUCK t4)
(TRUCK t5)
(TRUCK t6)
(TRUCK t7)
(TRUCK t8)
(TRUCK t9)
(TRUCK t10)
(TRUCK t11)
(TRUCK t12)
(TRUCK t13)
(TRUCK t14)
(TRUCK t15)
(TRUCK t16)
(TRUCK t17)
(TRUCK t18)
(TRUCK t19)
(TRUCK t20)
(TRUCK t21)
(TRUCK t22)
(TRUCK t23)
(TRUCK t24)
(TRUCK t25)
(TRUCK t26)
(TRUCK t27)
(TRUCK t28)
(TRUCK t29)
(TRUCK t30)
(TRUCK t31)
(TRUCK t32)
(TRUCK t33)
(TRUCK t34)
(TRUCK t35)
(TRUCK t36)
(TRUCK t37)
(TRUCK t38)
(TRUCK t39)
(TRUCK t40)
(TRUCK t41)
(TRUCK t42)
(TRUCK t43)
(TRUCK t44)
(TRUCK t45)
(TRUCK t46)
(TRUCK t47)
(TRUCK t48)
(TRUCK t49)
(LOCATION l00)
(in-city  l00 c0)
(LOCATION l01)
(in-city  l01 c0)
(LOCATION l02)
(in-city  l02 c0)
(LOCATION l03)
(in-city  l03 c0)
(LOCATION l04)
(in-city  l04 c0)
(LOCATION l10)
(in-city  l10 c1)
(LOCATION l11)
(in-city  l11 c1)
(LOCATION l12)
(in-city  l12 c1)
(LOCATION l13)
(in-city  l13 c1)
(LOCATION l14)
(in-city  l14 c1)
(LOCATION l20)
(in-city  l20 c2)
(LOCATION l21)
(in-city  l21 c2)
(LOCATION l22)
(in-city  l22 c2)
(LOCATION l23)
(in-city  l23 c2)
(LOCATION l24)
(in-city  l24 c2)
(LOCATION l30)
(in-city  l30 c3)
(LOCATION l31)
(in-city  l31 c3)
(LOCATION l32)
(in-city  l32 c3)
(LOCATION l33)
(in-city  l33 c3)
(LOCATION l34)
(in-city  l34 c3)
(LOCATION l40)
(in-city  l40 c4)
(LOCATION l41)
(in-city  l41 c4)
(LOCATION l42)
(in-city  l42 c4)
(LOCATION l43)
(in-city  l43 c4)
(LOCATION l44)
(in-city  l44 c4)
(LOCATION l50)
(in-city  l50 c5)
(LOCATION l51)
(in-city  l51 c5)
(LOCATION l52)
(in-city  l52 c5)
(LOCATION l53)
(in-city  l53 c5)
(LOCATION l54)
(in-city  l54 c5)
(LOCATION l60)
(in-city  l60 c6)
(LOCATION l61)
(in-city  l61 c6)
(LOCATION l62)
(in-city  l62 c6)
(LOCATION l63)
(in-city  l63 c6)
(LOCATION l64)
(in-city  l64 c6)
(LOCATION l70)
(in-city  l70 c7)
(LOCATION l71)
(in-city  l71 c7)
(LOCATION l72)
(in-city  l72 c7)
(LOCATION l73)
(in-city  l73 c7)
(LOCATION l74)
(in-city  l74 c7)
(LOCATION l80)
(in-city  l80 c8)
(LOCATION l81)
(in-city  l81 c8)
(LOCATION l82)
(in-city  l82 c8)
(LOCATION l83)
(in-city  l83 c8)
(LOCATION l84)
(in-city  l84 c8)
(LOCATION l90)
(in-city  l90 c9)
(LOCATION l91)
(in-city  l91 c9)
(LOCATION l92)
(in-city  l92 c9)
(LOCATION l93)
(in-city  l93 c9)
(LOCATION l94)
(in-city  l94 c9)
(LOCATION l100)
(in-city  l100 c10)
(LOCATION l101)
(in-city  l101 c10)
(LOCATION l102)
(in-city  l102 c10)
(LOCATION l103)
(in-city  l103 c10)
(LOCATION l104)
(in-city  l104 c10)
(LOCATION l110)
(in-city  l110 c11)
(LOCATION l111)
(in-city  l111 c11)
(LOCATION l112)
(in-city  l112 c11)
(LOCATION l113)
(in-city  l113 c11)
(LOCATION l114)
(in-city  l114 c11)
(LOCATION l120)
(in-city  l120 c12)
(LOCATION l121)
(in-city  l121 c12)
(LOCATION l122)
(in-city  l122 c12)
(LOCATION l123)
(in-city  l123 c12)
(LOCATION l124)
(in-city  l124 c12)
(LOCATION l130)
(in-city  l130 c13)
(LOCATION l131)
(in-city  l131 c13)
(LOCATION l132)
(in-city  l132 c13)
(LOCATION l133)
(in-city  l133 c13)
(LOCATION l134)
(in-city  l134 c13)
(LOCATION l140)
(in-city  l140 c14)
(LOCATION l141)
(in-city  l141 c14)
(LOCATION l142)
(in-city  l142 c14)
(LOCATION l143)
(in-city  l143 c14)
(LOCATION l144)
(in-city  l144 c14)
(LOCATION l150)
(in-city  l150 c15)
(LOCATION l151)
(in-city  l151 c15)
(LOCATION l152)
(in-city  l152 c15)
(LOCATION l153)
(in-city  l153 c15)
(LOCATION l154)
(in-city  l154 c15)
(LOCATION l160)
(in-city  l160 c16)
(LOCATION l161)
(in-city  l161 c16)
(LOCATION l162)
(in-city  l162 c16)
(LOCATION l163)
(in-city  l163 c16)
(LOCATION l164)
(in-city  l164 c16)
(LOCATION l170)
(in-city  l170 c17)
(LOCATION l171)
(in-city  l171 c17)
(LOCATION l172)
(in-city  l172 c17)
(LOCATION l173)
(in-city  l173 c17)
(LOCATION l174)
(in-city  l174 c17)
(LOCATION l180)
(in-city  l180 c18)
(LOCATION l181)
(in-city  l181 c18)
(LOCATION l182)
(in-city  l182 c18)
(LOCATION l183)
(in-city  l183 c18)
(LOCATION l184)
(in-city  l184 c18)
(LOCATION l190)
(in-city  l190 c19)
(LOCATION l191)
(in-city  l191 c19)
(LOCATION l192)
(in-city  l192 c19)
(LOCATION l193)
(in-city  l193 c19)
(LOCATION l194)
(in-city  l194 c19)
(LOCATION l200)
(in-city  l200 c20)
(LOCATION l201)
(in-city  l201 c20)
(LOCATION l202)
(in-city  l202 c20)
(LOCATION l203)
(in-city  l203 c20)
(LOCATION l204)
(in-city  l204 c20)
(LOCATION l210)
(in-city  l210 c21)
(LOCATION l211)
(in-city  l211 c21)
(LOCATION l212)
(in-city  l212 c21)
(LOCATION l213)
(in-city  l213 c21)
(LOCATION l214)
(in-city  l214 c21)
(LOCATION l220)
(in-city  l220 c22)
(LOCATION l221)
(in-city  l221 c22)
(LOCATION l222)
(in-city  l222 c22)
(LOCATION l223)
(in-city  l223 c22)
(LOCATION l224)
(in-city  l224 c22)
(LOCATION l230)
(in-city  l230 c23)
(LOCATION l231)
(in-city  l231 c23)
(LOCATION l232)
(in-city  l232 c23)
(LOCATION l233)
(in-city  l233 c23)
(LOCATION l234)
(in-city  l234 c23)
(LOCATION l240)
(in-city  l240 c24)
(LOCATION l241)
(in-city  l241 c24)
(LOCATION l242)
(in-city  l242 c24)
(LOCATION l243)
(in-city  l243 c24)
(LOCATION l244)
(in-city  l244 c24)
(LOCATION l250)
(in-city  l250 c25)
(LOCATION l251)
(in-city  l251 c25)
(LOCATION l252)
(in-city  l252 c25)
(LOCATION l253)
(in-city  l253 c25)
(LOCATION l254)
(in-city  l254 c25)
(LOCATION l260)
(in-city  l260 c26)
(LOCATION l261)
(in-city  l261 c26)
(LOCATION l262)
(in-city  l262 c26)
(LOCATION l263)
(in-city  l263 c26)
(LOCATION l264)
(in-city  l264 c26)
(LOCATION l270)
(in-city  l270 c27)
(LOCATION l271)
(in-city  l271 c27)
(LOCATION l272)
(in-city  l272 c27)
(LOCATION l273)
(in-city  l273 c27)
(LOCATION l274)
(in-city  l274 c27)
(LOCATION l280)
(in-city  l280 c28)
(LOCATION l281)
(in-city  l281 c28)
(LOCATION l282)
(in-city  l282 c28)
(LOCATION l283)
(in-city  l283 c28)
(LOCATION l284)
(in-city  l284 c28)
(LOCATION l290)
(in-city  l290 c29)
(LOCATION l291)
(in-city  l291 c29)
(LOCATION l292)
(in-city  l292 c29)
(LOCATION l293)
(in-city  l293 c29)
(LOCATION l294)
(in-city  l294 c29)
(LOCATION l300)
(in-city  l300 c30)
(LOCATION l301)
(in-city  l301 c30)
(LOCATION l302)
(in-city  l302 c30)
(LOCATION l303)
(in-city  l303 c30)
(LOCATION l304)
(in-city  l304 c30)
(LOCATION l310)
(in-city  l310 c31)
(LOCATION l311)
(in-city  l311 c31)
(LOCATION l312)
(in-city  l312 c31)
(LOCATION l313)
(in-city  l313 c31)
(LOCATION l314)
(in-city  l314 c31)
(LOCATION l320)
(in-city  l320 c32)
(LOCATION l321)
(in-city  l321 c32)
(LOCATION l322)
(in-city  l322 c32)
(LOCATION l323)
(in-city  l323 c32)
(LOCATION l324)
(in-city  l324 c32)
(LOCATION l330)
(in-city  l330 c33)
(LOCATION l331)
(in-city  l331 c33)
(LOCATION l332)
(in-city  l332 c33)
(LOCATION l333)
(in-city  l333 c33)
(LOCATION l334)
(in-city  l334 c33)
(LOCATION l340)
(in-city  l340 c34)
(LOCATION l341)
(in-city  l341 c34)
(LOCATION l342)
(in-city  l342 c34)
(LOCATION l343)
(in-city  l343 c34)
(LOCATION l344)
(in-city  l344 c34)
(LOCATION l350)
(in-city  l350 c35)
(LOCATION l351)
(in-city  l351 c35)
(LOCATION l352)
(in-city  l352 c35)
(LOCATION l353)
(in-city  l353 c35)
(LOCATION l354)
(in-city  l354 c35)
(LOCATION l360)
(in-city  l360 c36)
(LOCATION l361)
(in-city  l361 c36)
(LOCATION l362)
(in-city  l362 c36)
(LOCATION l363)
(in-city  l363 c36)
(LOCATION l364)
(in-city  l364 c36)
(LOCATION l370)
(in-city  l370 c37)
(LOCATION l371)
(in-city  l371 c37)
(LOCATION l372)
(in-city  l372 c37)
(LOCATION l373)
(in-city  l373 c37)
(LOCATION l374)
(in-city  l374 c37)
(LOCATION l380)
(in-city  l380 c38)
(LOCATION l381)
(in-city  l381 c38)
(LOCATION l382)
(in-city  l382 c38)
(LOCATION l383)
(in-city  l383 c38)
(LOCATION l384)
(in-city  l384 c38)
(LOCATION l390)
(in-city  l390 c39)
(LOCATION l391)
(in-city  l391 c39)
(LOCATION l392)
(in-city  l392 c39)
(LOCATION l393)
(in-city  l393 c39)
(LOCATION l394)
(in-city  l394 c39)
(LOCATION l400)
(in-city  l400 c40)
(LOCATION l401)
(in-city  l401 c40)
(LOCATION l402)
(in-city  l402 c40)
(LOCATION l403)
(in-city  l403 c40)
(LOCATION l404)
(in-city  l404 c40)
(LOCATION l410)
(in-city  l410 c41)
(LOCATION l411)
(in-city  l411 c41)
(LOCATION l412)
(in-city  l412 c41)
(LOCATION l413)
(in-city  l413 c41)
(LOCATION l414)
(in-city  l414 c41)
(LOCATION l420)
(in-city  l420 c42)
(LOCATION l421)
(in-city  l421 c42)
(LOCATION l422)
(in-city  l422 c42)
(LOCATION l423)
(in-city  l423 c42)
(LOCATION l424)
(in-city  l424 c42)
(LOCATION l430)
(in-city  l430 c43)
(LOCATION l431)
(in-city  l431 c43)
(LOCATION l432)
(in-city  l432 c43)
(LOCATION l433)
(in-city  l433 c43)
(LOCATION l434)
(in-city  l434 c43)
(LOCATION l440)
(in-city  l440 c44)
(LOCATION l441)
(in-city  l441 c44)
(LOCATION l442)
(in-city  l442 c44)
(LOCATION l443)
(in-city  l443 c44)
(LOCATION l444)
(in-city  l444 c44)
(LOCATION l450)
(in-city  l450 c45)
(LOCATION l451)
(in-city  l451 c45)
(LOCATION l452)
(in-city  l452 c45)
(LOCATION l453)
(in-city  l453 c45)
(LOCATION l454)
(in-city  l454 c45)
(LOCATION l460)
(in-city  l460 c46)
(LOCATION l461)
(in-city  l461 c46)
(LOCATION l462)
(in-city  l462 c46)
(LOCATION l463)
(in-city  l463 c46)
(LOCATION l464)
(in-city  l464 c46)
(LOCATION l470)
(in-city  l470 c47)
(LOCATION l471)
(in-city  l471 c47)
(LOCATION l472)
(in-city  l472 c47)
(LOCATION l473)
(in-city  l473 c47)
(LOCATION l474)
(in-city  l474 c47)
(LOCATION l480)
(in-city  l480 c48)
(LOCATION l481)
(in-city  l481 c48)
(LOCATION l482)
(in-city  l482 c48)
(LOCATION l483)
(in-city  l483 c48)
(LOCATION l484)
(in-city  l484 c48)
(LOCATION l490)
(in-city  l490 c49)
(LOCATION l491)
(in-city  l491 c49)
(LOCATION l492)
(in-city  l492 c49)
(LOCATION l493)
(in-city  l493 c49)
(LOCATION l494)
(in-city  l494 c49)
(AIRPORT l00)
(AIRPORT l10)
(AIRPORT l20)
(AIRPORT l30)
(AIRPORT l40)
(AIRPORT l50)
(AIRPORT l60)
(AIRPORT l70)
(AIRPORT l80)
(AIRPORT l90)
(AIRPORT l100)
(AIRPORT l110)
(AIRPORT l120)
(AIRPORT l130)
(AIRPORT l140)
(AIRPORT l150)
(AIRPORT l160)
(AIRPORT l170)
(AIRPORT l180)
(AIRPORT l190)
(AIRPORT l200)
(AIRPORT l210)
(AIRPORT l220)
(AIRPORT l230)
(AIRPORT l240)
(AIRPORT l250)
(AIRPORT l260)
(AIRPORT l270)
(AIRPORT l280)
(AIRPORT l290)
(AIRPORT l300)
(AIRPORT l310)
(AIRPORT l320)
(AIRPORT l330)
(AIRPORT l340)
(AIRPORT l350)
(AIRPORT l360)
(AIRPORT l370)
(AIRPORT l380)
(AIRPORT l390)
(AIRPORT l400)
(AIRPORT l410)
(AIRPORT l420)
(AIRPORT l430)
(AIRPORT l440)
(AIRPORT l450)
(AIRPORT l460)
(AIRPORT l470)
(AIRPORT l480)
(AIRPORT l490)
(OBJ p0)
(OBJ p1)
(OBJ p2)
(OBJ p3)
(OBJ p4)
(at t0 l00)
(at t1 l13)
(at t2 l24)
(at t3 l33)
(at t4 l42)
(at t5 l54)
(at t6 l61)
(at t7 l71)
(at t8 l80)
(at t9 l92)
(at t10 l104)
(at t11 l114)
(at t12 l121)
(at t13 l130)
(at t14 l141)
(at t15 l154)
(at t16 l161)
(at t17 l170)
(at t18 l180)
(at t19 l192)
(at t20 l204)
(at t21 l210)
(at t22 l223)
(at t23 l234)
(at t24 l242)
(at t25 l251)
(at t26 l262)
(at t27 l271)
(at t28 l283)
(at t29 l293)
(at t30 l304)
(at t31 l311)
(at t32 l321)
(at t33 l333)
(at t34 l341)
(at t35 l353)
(at t36 l364)
(at t37 l373)
(at t38 l384)
(at t39 l391)
(at t40 l402)
(at t41 l410)
(at t42 l420)
(at t43 l430)
(at t44 l443)
(at t45 l454)
(at t46 l464)
(at t47 l471)
(at t48 l484)
(at t49 l494)
(at p0 l160)
(at p1 l394)
(at p2 l244)
(at p3 l402)
(at p4 l21)
(at a0 l280)
(at a1 l270)
(at a2 l280)
(at a3 l300)
(at a4 l320)
)
(:goal
(and
(at p0 l401)
(at p1 l343)
(at p2 l360)
(at p3 l110)
(at p4 l133)
)
)
)


