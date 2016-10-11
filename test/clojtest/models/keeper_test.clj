(ns clojtest.models.keeper-test
  (:require [clojure.test :refer :all]
            [clojtest.core :refer :all]
            [clojtest.models.keeper :as keeper]))

(deftest file-name-test
  (testing "file-name."
           (is (= "countries.txt" (get keeper/file-name :countries)))))
