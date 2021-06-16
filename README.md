# android-infrastructure

`Android`基础支持库

## 添加依赖

`build.gradle`文件中添加：

```groovy
repositories {
    mavenCentral()
}

dependencies {
    implementation "io.github.daemon369:android-infrastructure:0.1.0"
}
```

可以在<https://mvnrepository.com/artifact/io.github.daemon369/android-infrastructure>查询最新版本

## 功能介绍

### `InfrastructureApp`

通用`Application`实现，应用使用`InfrastructureApp`或其子类来作为自定义`Application`时，可以简化基础支持库的很多功能的使用

### `FileProvider`

#### 功能

集成`android-infrastructure`的应用不需要关心`FileProvider`的问题，库中已做好处理，同时提供以下工具：

| 方法/属性 | 类型 | 是否需要`InfrastructureApp`支持 | 描述 |
| --- | --- | --- | --- |
| val Context.authority:String | 属性 | 否 | 获取`FileProvider`对应的`authority` |
| fun Context.fileToUri(file: File): Uri | 方法 | 否 | 将文件`file`转化为`FileProvider`对应的`Uri` |
| val authority:String | 属性 | 是 | 获取`FileProvider`对应的`authority` |
| fun File.fileToUri(): Uri | 方法 | 是 | 将文件转化为`FileProvider`对应的`Uri` |

#### 需求

使用`FileProvider`需要依赖`androidx.core:core`库的支持。确保当前应用有导入该库，如果没有，在`build.gradle`中添加：

```groovy
repositories {
    google()
}

dependencies {
    implementation "androidx.core:core:1.5.0"
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