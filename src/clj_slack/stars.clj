(ns clj-slack.stars
  (:use [clj-slack.core :only [slack-request]])
  (:refer-clojure :exclude [list]))

(defn list
  "Lists stars for a user."
  []
  (slack-request "stars.list"))
