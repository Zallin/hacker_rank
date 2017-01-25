(ns hacker-rank.prefix-compression-test
  (:require [clojure.test :refer :all]
            [hacker-rank.prefix-compression :refer :all]))

(defn prefix [[pre a b]] pre)
             
(deftest two-strings-are-equal
  (is (= (prefix (compress "abc" "abc"))
         "abc")))

(deftest one-string-is-substr-of-the-other
  (is (= (prefix (compress "abcde" "abc"))
         "abc"))
  (is (= (prefix (compress "abc" "abcde"))
         "abc")))

(deftest strings-have-no-common-prefix
  (is (= (prefix (compress "abc" "def"))
         "")))
