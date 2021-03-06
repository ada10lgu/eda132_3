


(define (problem logistics-c5-s5-p5-a50)
(:domain logistics-strips)
(:objects a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 a10 a11 a12 a13 a14 a15 a16 a17 a18 a19 a20 a21 a22 a23 a24 a25 a26 a27 a28 a29 a30 a31 a32 a33 a34 a35 a36 a37 a38 a39 a40 a41 a42 a43 a44 a45 a46 a47 a48 a49 
          c0 c1 c2 c3 c4 
          t0 t1 t2 t3 t4 
          l00 l01 l02 l03 l04 l10 l11 l12 l13 l14 l20 l21 l22 l23 l24 l30 l31 l32 l33 l34 l40 l41 l42 l43 l44 
          p0 p1 p2 p3 p4 
)
(:init
(AIRPLANE a0)
(AIRPLANE a1)
(AIRPLANE a2)
(AIRPLANE a3)
(AIRPLANE a4)
(AIRPLANE a5)
(AIRPLANE a6)
(AIRPLANE a7)
(AIRPLANE a8)
(AIRPLANE a9)
(AIRPLANE a10)
(AIRPLANE a11)
(AIRPLANE a12)
(AIRPLANE a13)
(AIRPLANE a14)
(AIRPLANE a15)
(AIRPLANE a16)
(AIRPLANE a17)
(AIRPLANE a18)
(AIRPLANE a19)
(AIRPLANE a20)
(AIRPLANE a21)
(AIRPLANE a22)
(AIRPLANE a23)
(AIRPLANE a24)
(AIRPLANE a25)
(AIRPLANE a26)
(AIRPLANE a27)
(AIRPLANE a28)
(AIRPLANE a29)
(AIRPLANE a30)
(AIRPLANE a31)
(AIRPLANE a32)
(AIRPLANE a33)
(AIRPLANE a34)
(AIRPLANE a35)
(AIRPLANE a36)
(AIRPLANE a37)
(AIRPLANE a38)
(AIRPLANE a39)
(AIRPLANE a40)
(AIRPLANE a41)
(AIRPLANE a42)
(AIRPLANE a43)
(AIRPLANE a44)
(AIRPLANE a45)
(AIRPLANE a46)
(AIRPLANE a47)
(AIRPLANE a48)
(AIRPLANE a49)
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
(at t0 l01)
(at t1 l11)
(at t2 l24)
(at t3 l34)
(at t4 l41)
(at p0 l04)
(at p1 l42)
(at p2 l40)
(at p3 l40)
(at p4 l32)
(at a0 l10)
(at a1 l40)
(at a2 l20)
(at a3 l20)
(at a4 l00)
(at a5 l20)
(at a6 l30)
(at a7 l10)
(at a8 l30)
(at a9 l00)
(at a10 l40)
(at a11 l40)
(at a12 l40)
(at a13 l00)
(at a14 l10)
(at a15 l00)
(at a16 l20)
(at a17 l00)
(at a18 l00)
(at a19 l30)
(at a20 l40)
(at a21 l00)
(at a22 l30)
(at a23 l40)
(at a24 l40)
(at a25 l10)
(at a26 l40)
(at a27 l30)
(at a28 l30)
(at a29 l40)
(at a30 l20)
(at a31 l40)
(at a32 l30)
(at a33 l20)
(at a34 l10)
(at a35 l10)
(at a36 l10)
(at a37 l10)
(at a38 l40)
(at a39 l40)
(at a40 l10)
(at a41 l10)
(at a42 l30)
(at a43 l20)
(at a44 l10)
(at a45 l10)
(at a46 l30)
(at a47 l40)
(at a48 l10)
(at a49 l00)
)
(:goal
(and
(at p0 l30)
(at p1 l04)
(at p2 l30)
(at p3 l44)
(at p4 l34)
)
)
)


