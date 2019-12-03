# RN Android Notification Settings

This native module provides a method to directly open the notification settings' of your app on Android's system.

## Getting started

`$ yarn add https://github.com/danibonilha/rn-android-notification-settings.git`

### Linking

`$ react-native link rn-android-notification-settings`

## Usage

```ts
import AndroidNotificationSettings from "rn-android-notification-settings";

AndroidNotificationSettings.openNotificationSettings(); // Opens app's system notification settings.
```
