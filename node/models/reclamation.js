var mongoose = require("mongoose");
var Schema = mongoose.Schema;

var Reclamation = new Schema(
    {
        dateReclamation:String,
        user: String,
        description: String,
    }
);


module.exports = mongoose.model("reclamations", Reclamation);