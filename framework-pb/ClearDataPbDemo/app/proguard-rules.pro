-optimizationpasses 5
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-dontpreverify
-verbose
-ignorewarnings
-optimizations !code/simplification/arithmetic,!field/*,!class/merging/*

-keepattributes SourceFile,LineNumberTable

-keep public class * extends android.app.Activity
-keep public class * extends android.support.v4.app.FragmentActivity
-keep public class * extends android.support.v4.app.Fragment
-keep public class * extends android.app.Application{
	!private <fields>;
    !private <methods>;
}
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class com.android.vending.licensing.ILicensingService


-keepclasseswithmembernames class * {
    native <methods>;
}

-keepclasseswithmembernames class * {
    public <init>(android.content.Context, android.util.AttributeSet);
}

-keepclasseswithmembernames class * {
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keep class * implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator *;
}

-keep class com.eg.android.AlipayGphone.R* {
  *;
}

-keep class com.alipay.mobile.quinox.BundleContext {
	!private <fields>;
    !private <methods>;
}

-keep class com.alipay.mobile.quinox.apk.FragmentActivityShell{
  !private <fields>;
    !private <methods>;
}

-keeppackagenames com.alipay.mobile.quinox.**
-keeppackagenames com.eg.android.**

-keep class com.alipay.mobile.quinox.engine.** {
	!private <fields>;
    !private <methods>;
}

-keep class com.alipay.mobile.quinox.shell.** {
	!private <fields>;
    !private <methods>;
}

-keep class com.alipay.mobile.quinox.apk.** {
  !private <fields>;
    !private <methods>;
}

-keep class com.alipay.mobile.apk.common.**{
	!private <fields>;
    !private <methods>;
}

-keep class com.alipay.mobile.quinox.startup.** {
  !private <fields>;
    !private <methods>;
}

-keep class com.eg.android.AlipayGphoneRC.R* {
  *;
} 

-keep class com.alipay.android.phone.automation.testui.MainTestActivity{
    !private <fields>;
    !private <methods>;
}

-keep class com.alipay.mobile.framework.service.ext.openplatform.persist.AllAppInfoDaoImpl{
    !private <fields>;
    !private <methods>;
}

-keepclassmembers class com.alipay.mobile.quinox.classloader.QuinoxClassLoader{
  *;
}

-keepclassmembernames class com.alipay.mobile.quinox.classloader.BundleClassLoader {
    private com.alipay.mobile.quinox.bundle.Bundle mBundle;
}

-keepclassmembernames class com.alipay.mobile.quinox.bundle.Bundle {
    private java.lang.String mName;
}

-keep class com.alipay.mobile.quinox.LauncherActivity*{
  *;
} 

-keep class com.alipay.mobile.quinox.utils.FileUtil{
  *;
}
-keep class com.alipay.android.launcher.StartupRuler{*;}

-keep class com.alipay.mobile.quinox.utils.**{ *; }

-keep class **{ *; }

-keep class com.alipay.android.phone.devtool.leakreporter.ApplicationInjector {
 *;
}
