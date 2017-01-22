(defproject hacker_rank "0.1.0-SNAPSHOT"
  :description "my solutions from fp hackerrank domain"
  :url "https://github.com/Zallin/hacker_rank"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot hacker-rank.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
