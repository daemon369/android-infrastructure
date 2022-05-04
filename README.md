# android-infrastructure

`Android`基础支持库

## 添加依赖

`build.gradle`文件中添加：

```groovy
repositories {
    mavenCentral()
}

dependencies {
    implementation "io.github.daemon369:android-infrastructure:1.0.0"
}
```

可以在<https://mvnrepository.com/artifact/io.github.daemon369/android-infrastructure>查询最新版本

## 问题

如果遇到如下错误：

    Cannot inline bytecode built with JVM target 1.8 into bytecode that is being built with JVM target 1.6. Please specify proper '-jvm-target' option
    Adding support for Java 8 language features could solve this issue.

解决方法：

```gradle
// build.gradle
android {
    // ...
    compileOptions {
        targetCompatibility JavaVersion.VERSION_1_8
        sourceCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
```

## 功能介绍

### `InfrastructureApp`

通用`Application`实现，应用使用`me.daemon.infrastructure.application.InfrastructureApp`或其子类来作为自定义`Application`时，可以简化基础支持库的很多功能的使用

### `FileProvider`

#### 功能

集成`android-infrastructure`的应用不需要关心`FileProvider`的问题，库中已做好处理，同时提供以下工具：

| 方法/属性 | 类型 | 是否需要`InfrastructureApp`支持 | 描述 |
| --- | --- | --- | --- |
| val Context.fileProviderAuthority:String | 属性 | 否 | 获取`FileProvider`对应的`authority` |
| fun Context.fileToUri(file: File): Uri | 方法 | 否 | 将文件`file`转化为`FileProvider`对应的`Uri` |
| val fileProviderAuthority:String | 属性 | 是 | 获取`FileProvider`对应的`authority` |
| fun File.fileToUri(): Uri | 方法 | 是 | 将文件转化为`FileProvider`对应的`Uri` |

#### 需求

使用`FileProvider`需要依赖`androidx.core:core`库的支持。确保当前应用有导入该库，如果没有，在`build.gradle`中添加：

```groovy
repositories {
    google()
}

dependencies {
    implementation "androidx.core:core:1.6.0"
}
```

如果不需要`FileProvider`支持，可以关闭该支持：在`AndroidManifest.xml`中移除该组件：

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    package="me.daemon.infrastructure.demo">

    <application>

        <!-- 添加下面内容以移除基础库提供的FileProvider实现 -->
        <provider
            android:name="me.daemon.infrastructure.file.FileProvider"
            android:authorities="${applicationId}.daemon.fileprovider"
            tools:node="remove" />

    </application>
</manifest>
```

### 网络安全配置

`android-infrastructure`中已经配置了如下网络安全配置文件`daemon_infrastructure_network_security_config.xml`：

```xml
<?xml version="1.0" encoding="utf-8"?>
<!-- https://developer.android.com/training/articles/security-config -->

<network-security-config xmlns:tools="http://schemas.android.com/tools">

    <base-config
        cleartextTrafficPermitted="true"
        tools:ignore="InsecureBaseConfiguration" />

    <debug-overrides>
        <trust-anchors>
            <certificates src="system" />
            <certificates src="user" />
        </trust-anchors>
    </debug-overrides>

</network-security-config>
```

支持明文网络请求，debug模式下支持用户安装的证书

如果不需要，可以在`AndroidManifest.xml`中覆盖基础库中的配置：

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    package="me.daemon.infrastructure.demo">

    <!-- 添加自定义网络配置文件network_security_config.xml，同时需要添加: tools:replace="android:networkSecurityConfig" -->
    <application
        android:networkSecurityConfig="@xml/network_security_config"
        tools:replace="android:networkSecurityConfig"
        >

    </application>
</manifest>
```

### 安装APK

`android-infrastructure`支持安装本地APK文件：

| 方法/属性 | 类型 | 是否需要`InfrastructureApp`支持 | 描述 |
| --- | --- | --- | --- |
| fun Context.installPackage(file: File) | 方法 | 否 | 安装APK |
| fun Context.installPackage(filePath: String) | 方法 | 否 | 安装APK |
| fun File.installPackage() | 方法 | 是 | 安装APK |
| fun String.installPackage() | 方法 | 是 | 安装APK |

安装APK需要`android.permission.REQUEST_INSTALL_PACKAGES`权限，`android-infrastructure`已经在`AndroidManifest.xml`中内置该权限，如果不需要可以移除：

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    package="me.daemon.infrastructure.demo">

    <!-- 使用`tools:node="remove"`移除不需要的权限 -->
    <uses-permission
        android:name="android.permission.REQUEST_INSTALL_PACKAGES"
        tools:node="remove" />

</manifest>
```
