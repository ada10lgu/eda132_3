


(define (problem logistics-c5-s5-p50-a5)
(:domain logistics-strips)
(:objects a0 a1 a2 a3 a4 
          c0 c1 c2 c3 c4 
          t0 t1 t2 t3 t4 
          l00 l01 l02 l03 l04 l10 l11 l12 l13 l14 l20 l21 l22 l23 l24 l30 l31 l32 l33 l34 l40 l41 l42 l43 l44 
          p0 p1 p2 p3 p4 p5 p6 p7 p8 p9 p10 p11 p12 p13 p14 p15 p16 p17 p18 p19 p20 p21 p22 p23 p24 p25 p26 p27 p28 p29 p30 p31 p32 p33 p34 p35 p36 p37 p38 p39 p40 p41 p42 p43 p44 p45 p46 p47 p48 p49 
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
(TRUCK t0)
(TRUCK t1)
(TRUCK t2)
(TRUCK t3)
(TRUCK t4)
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
(AIRPORT l00)
(AIRPORT l10)
(AIRPORT l20)
(AIRPORT l30)
(AIRPORT l40)
(OBJ p0)
(OBJ p1)
(OBJ p2)
(OBJ p3)
(OBJ p4)
(OBJ p5)
(OBJ p6)
(OBJ p7)
(OBJ p8)
(OBJ p9)
(OBJ p10)
(OBJ p11)
(OBJ p12)
(OBJ p13)
(OBJ p14)
(OBJ p15)
(OBJ p16)
(OBJ p17)
(OBJ p18)
(OBJ p19)
(OBJ p20)
(OBJ p21)
(OBJ p22)
(OBJ p23)
(OBJ p24)
(OBJ p25)
(OBJ p26)
(OBJ p27)
(OBJ p28)
(OBJ p29)
(OBJ p30)
(OBJ p31)
(OBJ p32)
(OBJ p33)
(OBJ p34)
(OBJ p35)
(OBJ p36)
(OBJ p37)
(OBJ p38)
(OBJ p39)
(OBJ p40)
(OBJ p41)
(OBJ p42)
(OBJ p43)
(OBJ p44)
(OBJ p45)
(OBJ p46)
(OBJ p47)
(OBJ p48)
(OBJ p49)
(at t0 l01)
(at t1 l10)
(at t2 l21)
(at t3 l33)
(at t4 l41)
(at p0 l41)
(at p1 l03)
(at p2 l30)
(at p3 l12)
(at p4 l24)
(at p5 l01)
(at p6 l31)
(at p7 l10)
(at p8 l10)
(at p9 l10)
(at p10 l31)
(at p11 l30)
(at p12 l40)
(at p13 l31)
(at p14 l11)
(at p15 l03)
(at p16 l20)
(at p17 l13)
(at p18 l22)
(at p19 l24)
(at p20 l23)
(at p21 l10)
(at p22 l14)
(at p23 l20)
(at p24 l41)
(at p25 l02)
(at p26 l23)
(at p27 l24)
(at p28 l02)
(at p29 l03)
(at p30 l40)
(at p31 l13)
(at p32 l22)
(at p33 l10)
(at p34 l04)
(at p35 l44)
(at p36 l42)
(at p37 l10)
(at p38 l23)
(at p39 l03)
(at p40 l40)
(at p41 l12)
(at p42 l00)
(at p43 l30)
(at p44 l33)
(at p45 l14)
(at p46 l12)
(at p47 l20)
(at p48 l24)
(at p49 l24)
(at a0 l40)
(at a1 l30)
(at a2 l00)
(at a3 l40)
(at a4 l00)
)
(:goal
(and
(at p0 l02)
(at p1 l34)
(at p2 l14)
(at p3 l40)
(at p4 l20)
(at p5 l14)
(at p6 l24)
(at p7 l33)
(at p8 l41)
(at p9 l04)
(at p10 l13)
(at p11 l04)
(at p12 l13)
(at p13 l00)
(at p14 l42)
(at p15 l44)
(at p16 l12)
(at p17 l00)
(at p18 l31)
(at p19 l22)
(at p20 l13)
(at p21 l11)
(at p22 l21)
(at p23 l14)
(at p24 l21)
(at p25 l01)
(at p26 l21)
(at p27 l03)
(at p28 l42)
(at p29 l33)
(at p30 l24)
(at p31 l40)
(at p32 l11)
(at p33 l04)
(at p34 l20)
(at p35 l11)
(at p36 l30)
(at p37 l23)
(at p38 l13)
(at p39 l21)
(at p40 l12)
(at p41 l23)
(at p42 l04)
(at p43 l34)
(at p44 l43)
(at p45 l41)
(at p46 l20)
(at p47 l10)
(at p48 l14)
(at p49 l44)
)
)
)


