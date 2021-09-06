# Changelog

## [0.3.0] - 2021-09-06

### Changed

- 将`InfrastructureApp`移动到单独的库`android-infrastructure-application`中，废弃已有的`InfrastructureApp`类
- 升级依赖
    - `gradle`插件升级为`7.0.2`
    - `kotlin`升级为`1.5.21`
    - `androidx.core:core`升级为`1.6.0`

## [0.2.0] - 2021-06-26

### Changed

- `authority`替换为意义更清晰的`fileProviderAuthority`
- `targetSdkVersion`降为`23`

## [0.1.3] - 2021-06-22

### Changed

- 使用`RequireInfrastructureApp`注解标记依赖`InfrastructureApp`实例的方法、属性等

## [0.1.2] - 2021-06-20

### Added

- 支持安装apk

## [0.1.1] - 2021-06-16

### Added

- 添加网络安全配置

## [0.1.0] - 2021-06-16

### Added

- 增加`InfrastructureApp`，用于简化工具基础库的使用
- 增加`FileProvider`及相关工具
