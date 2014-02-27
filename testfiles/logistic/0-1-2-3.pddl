


(define (problem logistics-c1-s2-p3-a0)
(:domain logistics-strips)
(:objects 
          c0 
          t0 
          l00 l01 
          p0 p1 p2 
)
(:init
(CITY c0)
(TRUCK t0)
(LOCATION l00)
(in-city  l00 c0)
(LOCATION l01)
(in-city  l01 c0)
(AIRPORT l00)
(OBJ p0)
(OBJ p1)
(OBJ p2)
(at t0 l00)
(at p0 l01)
(at p1 l00)
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


