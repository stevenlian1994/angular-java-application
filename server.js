var express = require('express')
var app = express();
var bodyParser = require('body-parser')
var path = require('path')

app.use(bodyParser.json());
app.use(express.static(__dirname + '/componentPractice/dist/componentPractice' ));

// app.get('/', function(req,res){
//     Movie.find({}, function(err,movies){
//         if(err){
//             console.log('something went wrong');
//         } else {
//             res.json({movies})
//         }
//     })
// })

app.all("*", (req,res,next) => {
    res.sendFile(path.resolve("./componentPractice/dist/componentPractice/index.html"))
});

app.listen(8000, function(){
    console.log('connected to port 8000')
})
