import { NativeModules } from "react-native";

const { AndroidNotificationSettings } = NativeModules;

export const { openNotificationSettings } = AndroidNotificationSettings;

export default AndroidNotificationSettings;
