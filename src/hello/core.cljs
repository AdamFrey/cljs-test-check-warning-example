(ns hello.core
  (:require [clojure.test.check.generators :as gen]))

(prn (gen/sample gen/any-printable))
