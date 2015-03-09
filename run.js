try {
    require("source-map-support").install();
} catch(err) {
}
require("./out/goog/bootstrap/nodejs.js");
require("./out/camel_snake_kebab_test.js");
goog.require("camel_snake_kebab_test.core");
goog.require("cljs.nodejscli");
