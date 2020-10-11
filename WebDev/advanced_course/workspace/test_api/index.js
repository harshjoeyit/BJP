var express = require('express'),
      app = express();

const mongoose = require('mongoose');
mongoose.connect('mongodb://localhost/db', { useNewUrlParser: true });

const db = mongoose.connection;
db.on('error', console.error.bind(console, 'connection error:'));
db.once('open', function () {
      console.log('App connected!');
});

const kittySchema = new mongoose.Schema({
      name: String
});

// NOTE: methods must be added to the schema before compiling it with mongoose.model()
kittySchema.methods.speak = function () {
      const greeting = this.name
            ? "Meow name is " + this.name
            : "I don't have a name";
      console.log(greeting);
}


const Kitten = mongoose.model('Kitten', kittySchema);

const fluffy = new Kitten({ name: 'fluffy' });
fluffy.speak(); // "Meow name is fluffy"

fluffy.save(function (err, fluffy) {
      if (err) return console.error(err);
      fluffy.speak();
});

Kitten.find(function (err, kittens) {
      if (err) return console.error(err);
      console.log(kittens);
});

app.get('/', function (req, res) {
      res.send('running');
});

app.listen(3000, function () {
      console.log("App is running on port 3000");
}); 