// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const greetings =
      ['Hello world!', '¡Hola Mundo!', '你好，世界！', 'Bonjour le monde!'];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}


/**
 * Fetches the text from the HelloWorldServlet and adds it to the page
 */

async function showServerText(){

    const responseFromServer = await fetch('/hello');
    const textFromResponse = await responseFromServer.text();

    const textContainer = document.getElementById('text-container');
    textContainer.innerText = textFromResponse;

}

/**
 * Fetches the JSON String from the QuoteServlet and adds it to the page
 */

async function showQuote(){
     
    //send a request to /quotes
    const responseFromServer = await fetch('/quotes');

    //parse the response as JSON.
    const myQuotes = await responseFromServer.json();

    const quoteContainer = document.getElementById('quote-container');

    console.log(myQuotes);
 
    const quote = myQuotes[Math.floor(Math.random()*myQuotes.length)];

    quoteContainer.innerText = quote;


 }