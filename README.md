Google Roads API Sample
=======================

## About

The [Google Maps Roads API][roads] identifies the roads a vehicle was traveling along and provides additional metadata about those roads, such as speed limits.
![Analytics](https://maps-ga-beacon.appspot.com/UA-12846745-20/roads-api-samples/readme?pixel)

This sample demonstrates some advanced usage of the Roads API on Android and is intended to support the [Advanced Usage][advanced-usage] documentation.

The code supporting this article has been provided as a single Android app for illustrative purposes.
In practice you should not distribute your server-side API keys in an Android app as your key cannot
be secured against unauthorised access from a third party. Instead, to secure your keys you should
deploy the API-facing code as a server-side proxy and have your Android app send requests via the
proxy, ensuring requests are authorized.

## Building the app

This app requires two keys before it will run, one for the Google Maps API for Android and one for the Roads API.

To obtain a Google Maps API for Android key, follow the instructions in the API's [Getting Started guide][android-key] and add it to the `google_maps_key` field in `app/src/debug/res/values/api_keys.xml`.

To obtain a Roads API key, follow the instructions in the [API key][roads-key] section of the Roads docs and add it
to the `google_maps_web_services_key` field in `app/src/debug/res/values/api_keys.xml`.

Then plug your phone in and run:

    ./gradlew installDebug

Alternatively, import the source code into Android Studio (File, Import Project) and hit the :arrow_forward: play button.

## License

    Copyright 2015 Google Inc. All rights reserved.
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


[roads]: https://developers.google.com/maps/documentation/roads/
[advanced-usage]: https://developers.google.com/maps/documentation/roads/advanced
[android-key]: https://developers.google.com/maps/documentation/android/start#get_an_android_certificate_and_the_google_maps_api_key
[roads-key]: https://developers.google.com/maps/documentation/roads/#api_key
