(ns hacker-rank.string-compression-test
  (:require [clojure.test :refer :all]
            [hacker-rank.string-compression :refer :all]))

(deftest one-character-string
  (is (= (compress "a")
         "a")))

(deftest one-character-repeated-multiple-times
  (is (= (compress "aaa")
         "a3")))

(deftest multiple-repeated-chars
  (is (= (compress "aabbbcccdddd")
         "a2b3c3d4")))

(deftest mixed-string
  (is (= (compress "aaabbcdfeee")
         "a3b2cdfe3")))


