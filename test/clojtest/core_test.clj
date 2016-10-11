(ns clojtest.core-test
  (:require [clojure.test :refer :all]
            [clojtest.core :refer :all]
            [clojtest.models.vk-api :as vk-api]))

(deftest a-test
  (testing "FIXME, I fail."
   (let [first-country (first (vk-api/get-countries))]
     (is (= "Україна" (get first-country "title")))
     (is (= 2 (get first-country "cid"))))))
