var base_url = "https://api.themoviedb.org/3/";
var api_key = "?api_key=89affa2cbcf8890a6f1ad6287012fd67";
var action;
var query_url;

// poster... 
var base_poster_url = "https://image.tmdb.org/t/p/";
var poster_width; // poster width options "w92", "w154", "w185", "w342", "w500", "w780", "original
// poster url = base_poster_url + poster_width + data.poster_path;   (data = search result of movie search)

var all_genres = [];
var options = {
      lang: "&language=en-US",
      orderby: {
            popularity: "&sort_by=popularity.desc",
            vote_count: "&sort_by=vote_count.desc",

      }
}


// search people 
// https://api.themoviedb.org/3/search/person?api_key=89affa2cbcf8890a6f1ad6287012fd67&language=en-US&query=scarlett%20johansson&page=1&include_adult=false
// we can also set adult true


// search tv shows 
// https://api.themoviedb.org/3/search/tv?api_key=89affa2cbcf8890a6f1ad6287012fd67&language=en-US&page=1&query=game%20of%20thrones&include_adult=false

// top rated
// https://api.themoviedb.org/3/tv/popular?api_key=89affa2cbcf8890a6f1ad6287012fd67&language=en-US&page=1


// search movies 
/*
      multi search - people + movies + tv shows
      https://api.themoviedb.org/3/search/multi?api_key=89affa2cbcf8890a6f1ad6287012fd67&language=en-US&query=dangal&page=1

      movie search
      https://api.themoviedb.org/3/search/movie?api_key=89affa2cbcf8890a6f1ad6287012fd67&language=en-US&query=iron%20man&page=1&include_adult=false

      most liked
      https://api.themoviedb.org/3/discover/movie?api_key=89affa2cbcf8890a6f1ad6287012fd67&language=en-US&sort_by=vote_count.desc

      similar movies
      http://api.themoviedb.org/3/movie/3543/similar?api_key=89affa2cbcf8890a6f1ad6287012fd67&language=en-US&page=1

      by release data
      format - yy-mm-dd
      https://api.themoviedb.org/3/discover/movie?api_key=89affa2cbcf8890a6f1ad6287012fd67&primary_release_date.gte=2020-01-01&primary_release_date.lte=2020-06-01

*/


// remember to change pages - load pages on next when - clicked by changing url


// get images
// /movie/{movie_id}/images


/* 
      
      By genre
      https://api.themoviedb.org/3/discover/movie?api_key=89affa2cbcf8890a6f1ad6287012fd67&with_genres=18&primary_release_year=2014

      All generes
      https://api.themoviedb.org/3/genre/movie/list?api_key=89affa2cbcf8890a6f1ad6287012fd67&language=en-US

      by cast and genre
      https://api.themoviedb.org/3/discover/movie?api_key=89affa2cbcf8890a6f1ad6287012fd67&with_genres=878&with_cast=500&sort_by=vote_average.desc

      sort by revenue & release year
      https://api.themoviedb.org/3/discover/movie?api_key=89affa2cbcf8890a6f1ad6287012fd67&sort_by=revenue.desc&primary_release_year=2015

      by people in the movie
      https://api.themoviedb.org/3/discover/movie?api_key=89affa2cbcf8890a6f1ad6287012fd67&with_people=287,819

      by cast and certification country
      http://api.themoviedb.org/3/discover/movie?api_key=89affa2cbcf8890a6f1ad6287012fd67&certification_country=US&with_cast=500



*/

function checkResponse(response) {
      if (!response.ok) {
            throw Error(response.status);
      }
      return response;
}

function getMovieDetails(movieId) {
      action = "movie/";
      query_url = base_url + action + movieId + api_key;

      fetch(query_url)
            .then(checkResponse)
            .then(function (response) {
                  console.log("All Ok!");
                  // console.log(response);
                  return response.json();
            })
            .then(function (data) {
                  console.log(data);
            })
            .catch(function (error) {
                  console.log(error);
            });
}

// ..............................................................

function getSearchString(media) {
      var keywords = media.split(" ");
      return keywords.join("+");
}

function displaySearchResults(data) {
      console.log(data);
      // display only some results - create a "view more link" and use ajax to display more 
      // segregate the result based on media_type
      // clicking on the results opens up the details page 
}

// make checkbox list of genres
function fillGenres(data) {
      all_genres = data.genres.map(function (element) {
            return element.name;
      });
}

function getAllGenres() {
      query_url = "https://api.themoviedb.org/3/genre/movie/list?api_key=89affa2cbcf8890a6f1ad6287012fd67&language=en-US";
      if (all_genres.length == 0) {
            fetch(query_url)
                  .then(checkResponse)
                  .then(function (response) {
                        console.log("All Ok!");
                        // console.log(response);
                        return response.json();
                  })
                  .then(fillGenres)
                  .catch(function (error) {
                        console.log(error);
                  });
      }
}
getAllGenres();

function movieSearchByReleaseYear(year) {
      var date_beg = year + "-01-01";
      var date_end = year + "-12-31";
      movieSearchByReleaseDate(date_beg, date_end);
}
// movieSearchByReleaseYear(2010);

// date should be formatted already
function movieSearchByReleaseDate(date_beg, date_end) {
      action = "discover/movie";
      query_url = base_url + action + api_key + "&primary_release_date.gte=" + date_beg + "&primary_release_date.lte=" + date_end + options.orderby.popularity;

      fetch(query_url)
            .then(checkResponse)
            .then(function (response) {
                  console.log("All Ok!");
                  // console.log(response);
                  return response.json();
            })
            .then(displaySearchResults)
            .catch(function (error) {
                  console.log(error);
            });
}

// option displayed on the details page 
function movieSearchSimilar(id) {
      action = "movie/" + id + "/similar";
      query_url = base_url + action + api_key + options.lang;

      fetch(query_url)
            .then(checkResponse)
            .then(function (response) {
                  console.log("All Ok!");
                  // console.log(response);
                  return response.json();
            })
            .then(displaySearchResults)
            .catch(function (error) {
                  console.log(error);
            });
}
// movieSearchSimilar(168259);

function movieSearchMostLiked() {
      action = "discover/movie";
      query_url = base_url + action + api_key + options.lang + "&" + options.orderby.vote_count;

      fetch(query_url)
            .then(checkResponse)
            .then(function (response) {
                  console.log("All Ok!");
                  // console.log(response);
                  return response.json();
            })
            .then(displaySearchResults)
            .catch(function (error) {
                  console.log(error);
            });
}
// movieSearchMostLiked();

function movieSearch(movie) {
      action = "search/movie";
      query_url = base_url + action + api_key + options.lang + "&query=" + getSearchString(movie) + options.orderby.popularity;

      fetch(query_url)
            .then(checkResponse)
            .then(function (response) {
                  console.log("All Ok!");
                  // console.log(response);
                  return response.json();
            })
            .then(displaySearchResults)
            .catch(function (error) {
                  console.log(error);
            });
}
// movieSearch("3 idiots");

function multiSearch(media) {
      action = "search/multi";
      query_url = base_url + action + api_key + options.lang + "&query=" + getSearchString(media) + options.orderby.popularity;

      fetch(query_url)
            .then(checkResponse)
            .then(function (response) {
                  console.log("All Ok!");
                  // console.log(response);
                  return response.json();
            })
            .then(displaySearchResults)
            .catch(function (error) {
                  console.log(error);
            });
}
// multiSearch("sanon");



// getMovieDetails(343611);