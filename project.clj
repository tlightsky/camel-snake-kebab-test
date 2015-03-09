(defproject camel-snake-kebab-test "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2755"]]

  :node-dependencies [[source-map-support "0.2.8"]]

  :plugins [[lein-cljsbuild "1.0.4"]
            [lein-npm "0.4.0"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "camel-snake-kebab-test"
              :source-paths ["src"]
              :compiler {
                :output-to "out/camel_snake_kebab_test.js"
                :output-dir "out"
                :target :nodejs
                :optimizations :none
                :source-map true}}]})
