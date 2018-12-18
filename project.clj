(defproject viebel/klipse-clj "10.0.1"
  :description "Self-hosted clojurescript library"
  :license "GPL-3.0"
  :url "https://github.com/viebel/klipse-clj"
  :clean-targets ^{:protect false} ["resources/public"
                                    "resources/private"]
  :plugins [[lein-cljsbuild "1.1.5"]
            [lein-hiera "0.9.5"]
            [lein-tools-deps "0.4.1"]]
  :hiera {:path "deps-graph.png"
          :vertical true
          :show-external false
          :cluster-depth 2
          :trim-ns-prefix true})
