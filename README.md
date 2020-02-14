# EventApi

### Features

- Use the library by calling `EventLib.searchForEvent("movie")`
- Network call are handled inside the library.
- Sample uses MVVM architecture with dagger.


### Implementation
- Add it in your root build.gradle at the end of repositories:

		allprojects {
			repositories {
				...
				maven { url 'https://jitpack.io' }
			}
		}

- Add the dependency

		dependencies {
			implementation 'com.github.kkc280947:EventsApi:1.0.0'
		}
