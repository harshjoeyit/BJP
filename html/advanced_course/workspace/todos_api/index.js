var express = require('express'),
      app = express(),
      port = process.env.PORT || 3000,
      bodyParser = require('body-parser');

// todoRoutes contains the exports from our ./routes/todos.js file 
var todoRoutes = require('./routes/todos');

// configure the app to use bodyParser()
app.use(bodyParser.urlencoded({extended: true}));
app.use(bodyParser.json());
app.use(express.static(__dirname + '/views'));
app.use(express.static('public'));

// home page route /
app.get('/', function (req, res) {
      // this is refrencing the views - index.html
      res.sendFile('index.html');
});

// all routes that start like /api/todos/ are in todoRoutes
app.use('/api/todos', todoRoutes);

app.listen(port, function () {
      console.log("App is running on port: " + port);
}); 