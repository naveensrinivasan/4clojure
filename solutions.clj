; problem 2
= (- 10 (* 2 3)) 4)

;problem 3
(= "HELLO WORLD" (.toUpperCase "hello world"))

; problem 4
(= (list :a :b :c) '(:a :b :c))

;problem 5
(= '(1 2 3 4) (conj '(2 3 4) 1))
(= '(1 2 3 4) (conj '(3 4) 2 1))

;problem 6
(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

;problem 7
(= [1 2 3 4] (conj [1 2 3] 4))
(= [1 2 3 4] (conj [1 2] 3 4))

;problem 8
(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))
(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))