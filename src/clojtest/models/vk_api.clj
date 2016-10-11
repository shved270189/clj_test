(ns clojtest.models.vk-api
  (:require [clj-http.client :as client])
  (:require [clojure.data.json :as json]))

(defn get-countries
  []
  (get
    (json/read-str
      (get
        (client/get "https://api.vk.com/method/database.getCountries" {:as :json})
        :body))
   "response"))
