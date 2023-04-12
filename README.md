# JsonPlaceholder Posts Sample app

This is an example Android app that demonstrates the use of various techniques to fetch posts from the JsonPlaceholder API and display them in the app. The app utilizes RecyclerView, MVVM architecture, Restful API with Retrofit, and Callbacks to achieve this functionality.

## Features

- Fetches posts data from the JsonPlaceholder API using Retrofit, a widely-used HTTP client for Android.
- Displays the fetched posts in a RecyclerView, which provides an efficient and optimized way of displaying lists of data in Android.
- Follows MVVM (Model-View-ViewModel) architecture, which separates concerns and promotes a cleaner codebase.
- Implements a callback mechanism to handle asynchronous data retrieval and display.

## Techniques Used

### RecyclerView

The app uses RecyclerView to display the fetched posts in a list format. RecyclerView is a powerful UI component in Android that efficiently handles large lists of data, providing smooth scrolling and optimized memory usage. The app utilizes the RecyclerView.Adapter and RecyclerView.ViewHolder classes to implement the RecyclerView.

### MVVM Architecture

The app follows the MVVM (Model-View-ViewModel) architecture pattern, which separates concerns and promotes a clear separation of responsibilities. The Model represents the data, the View displays the UI, and the ViewModel acts as an intermediary between the Model and View, handling data logic and communication. The app uses the ViewModel and LiveData classes from the Android Architecture Components to implement MVVM.

### Restful API with Retrofit

The app uses Retrofit, a popular HTTP client for Android, to make RESTful API calls and fetch posts data from the JsonPlaceholder API. Retrofit simplifies the process of making API calls and handling responses, providing a clean and efficient way to interact with RESTful APIs in Android. The app defines a Retrofit service interface that defines the API endpoints and uses Retrofit's annotations to specify the API method, URL, and request/response formats.

### Callbacks

The app implements a callback mechanism to handle asynchronous data retrieval and display. Callbacks are used in conjunction with Retrofit to handle the response from the API call. When the API call is successful, the app updates the LiveData in the ViewModel and notifies the RecyclerView Adapter to refresh the list. If the API call fails, appropriate error handling is implemented using callbacks as well.

## Usage

To use this app, follow these steps:

1. Clone the repository from GitHub: [https://github.com/George-Tharwat-Thabet/JsonPlaceholder-Posts-Sample](https://github.com/George-Tharwat-Thabet/JsonPlaceholder-Posts-Sample)
2. Import the project into Android Studio.
3. Build and run the app on an Android device or emulator.
4. The app will fetch posts data from the JsonPlaceholder API and display them in a RecyclerView using MVVM architecture and Retrofit for RESTful API calls.

## Dependencies

The following dependencies are used in this project:

```groovy
// Retrofit for making RESTful API calls
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

// RecyclerView for displaying lists of data
implementation 'androidx.recyclerview:recyclerview:1.2.1'

// ViewModel and LiveData for implementing MVVM architecture
implementation 'androidx.lifecycle:lifecycle-viewmodel:2.4.1'
implementation 'androidx.lifecycle:lifecycle-livedata:2.4.1'

// Callback for handling asynchronous data retrieval
implementation 'com.squareup.retrofit2:retrofit:2.9.0'

## Contributing

If you wish to contribute to this project, please follow these steps:

1. Fork the repository from GitHub.
2. Create a new branch with a descriptive name for your contribution.
3. Make your changes and ensure that the app is running correctly.
4. Submit a pull request with a detailed description of your changes.
5. Your contribution will be reviewed, and if approved, it will be merged into the main branch.

## License

This project is licensed under the MIT License. You can find the full text of the license in the [LICENSE](LICENSE) file.

## Acknowledgements

I would like to acknowledge the following resources that were used in the development of this app:

- [JsonPlaceholder API](https://jsonplaceholder.typicode.com/) for providing the posts data used in this example.
- [Retrofit Documentation](https://square.github.io/retrofit/) for the comprehensive documentation on using Retrofit for RESTful API calls.
- [Android Developer Documentation](https://developer.android.com/docs) for the official documentation on Android app development, including RecyclerView, MVVM architecture, and LiveData.
- [Stack Overflow](https://stackoverflow.com/) for the community-driven support and insights provided by fellow developers.
