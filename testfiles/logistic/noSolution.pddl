


(define (problem logistics-c1-s2-p3-a0)
(:domain logistics-strips)
(:objects 
          c0 c1
          t0 t1
          l00 l01 l02
          p0 p1 p2 
)
(:init
(CITY c0)
(CITY c1)
(TRUCK t0)
(TRUCK t1)
(LOCATION l00)
(in-city  l00 c0)
(LOCATION l01)
(in-city  l01 c0)
(LOCATION l02)
(in-city  l02 c1)
(AIRPORT l00)
(OBJ p0)
(OBJ p1)
(OBJ p2)
(at t0 l00)
(at t1 l02)
(at p0 l01)
(at p1 l02)
(at p2 l01)
)
(:goal
(and
(at p0 l01)
(at p1 l00)
(at p2 l00)
)
)
)


