(ns com.wsscode.test.chuck.regexes-test
  (:require [clojure.test :refer-macros [deftest is are run-tests]]
            [com.wsscode.test.chuck.regexes :as regex]
            [clojure.test.check.generators :as gen]))

(deftest test-gen-from-regex
  (are [re] (re-find re (gen/generate (regex/gen-string-from-regex re)))
    #"\d{9}"
    #"(Apt\.|Suite) \d{3}"))

(comment
  (gen/generate (regex/gen-string-from-regex #"(Apt\.|Suite) \d{3} [a-z]{3}")))
