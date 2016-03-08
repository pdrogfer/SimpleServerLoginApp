# Simple Server Login App
Sample Android app to store and retrieve passwd in a server database

### Description
The app implements a SignUp and Login logic, where the user's email is stored/retrieved to a server database. The result activity
just displays user's email. It also makes use of [loopj](http://loopj.com/android-async-http/) for efficient http calls, and
[butterknife](http://jakewharton.github.io/butterknife/) for simple view injection, and although the latter is completely 
unrelated to the purpose of this demo, I advise you to start using it.

### Usage
Navigate the code or clone to your machine:
```
git clone https://github.com/pdrogfer/simple-server-login-app.git
```
Then open it in Android Studio. You will have to implement/use your own web service for it to work. I am in the process of migrating all my experimental backend 
code to a Raspberry Pi, so it can be down at the moment. Feel free to make pull request to improve this code or documentation. 
Don't forget to give me a **star** if this was helpful to you!

### License
This code is on the public domain, under the [CC0 1.0](https://creativecommons.org/publicdomain/zero/1.0/) license.
