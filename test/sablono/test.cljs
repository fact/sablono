(ns sablono.test
  (:require [doo.runner :refer-macros [doo-tests]]
            [sablono.benchmark]
            [sablono.core-test]
            [sablono.interpreter-test]
            [sablono.util-test]))

(doo-tests 'sablono.benchmark
           'sablono.core-test
           'sablono.interpreter-test
           'sablono.util-test)
