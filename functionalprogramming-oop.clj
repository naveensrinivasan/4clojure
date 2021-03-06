; Excercise 3
;Implement add-squares.
(apply + (map (fn [x] (* x x)) '(1 2 5))) 
; Excercise 4
; Factorial of 5 without recursion and loops
(apply * (range 1 6))
;take
(take 3 (filter even? (range 10) ))
;distinct & concat
(distinct(concat [1 2 3] [1 4 5]))
;repeat
(repeat 2 (range 5))
;interleave
(interleave (range 10 20) (range 30 40))
;drop
(drop 2 (range 10))
;drop-last
(drop-last 2 (range 10))
;flatten
(flatten [100 101 [200 [300 301]201]])
;partition
(partition 3 (range 10))
;every
(every? odd?'(1 3 5))
;Excercise 6
(defn prefix-of? [f s] (= f(take (count f)s)))

(def tails
     (fn [seq]
       (map drop
            (range (inc (count seq)))
            			(repeat 
            				(inc (count seq)) 
            			seq)
            		)))
;Excercise 3.4
(def point {:x 1, :y 2, :__class_symbol__ 'Point})

(def Point
     (fn [x y]
       {:x x,
        :y y
        :__class_symbol__ 'Point}))

(def x :x)
(def y :y)
(def class-of :__class_symbol__)

(def shift
     (fn [this xinc yinc]
       (Point (+ (x this) xinc)
              (+ (y this) yinc))))

(def Triangle
     (fn [point1 point2 point3]
       {:point1 point1, :point2 point2, :point3 point3
        :__class_symbol__ 'Triangle}))


(def right-triangle (Triangle (Point 0 0)
                              (Point 0 1)
                              (Point 1 0)))

(def equal-right-triangle (Triangle (Point 0 0)
                                    (Point 0 1)
                                    (Point 1 0)))

(def different-triangle (Triangle (Point 0 0)
                                  (Point 0 10)
                                  (Point 10 0)))
