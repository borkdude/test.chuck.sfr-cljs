(ns com.wsscode.test.chuck.core
  (:require [com.wsscode.test.chuck.regexes :as cljs-reg]
            [com.gfredericks.test.chuck.regexes :as clj-reg]))

(defn string-from-regex
  [regex]
  #?(:clj
     (clj-reg/gen-string-from-regex regex)
     :cljs
     (cljs-reg/gen-string-from-regex regex)))
