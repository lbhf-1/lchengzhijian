# 旅程之剑 (Lvchengzhijian)

一个 Minecraft **1.20.1 Forge** 模组，为旅行提供辅助。

- **模组 ID**：`lchengzhijian`
- **版本**：1.1.2
- **适用版本**：Minecraft 1.20.1 / Forge 47+
- **作者**：六不合法
- **协议**：[MIT](LICENSE)
- **仓库**：[GitHub](https://github.com/lbhf-1/lchengzhijian) · [Gitee](https://gitee.com/lbh_cangku/lchengzhijian)

## 内容

### 旅程之剑

一把自定义武器，注册于 `minecraft:swords` 物品标签，可被剑类相关机制正常识别。

### 旅程盔甲（四件套）

头盔、胸甲、护腿、靴子，穿戴后使用自定义护甲层贴图。

### 静止回复饱食度

站立不动时逐步恢复饥饿值，饱食度满后转回复饱和度；一旦移动则计数清零。

## 安装

1. 安装 Minecraft 1.20.1 与 Forge 47.x
2. 把 `lchengzhijian-1.1.2-forge-1.20.1.jar` 放进 `.minecraft/mods/`
3. 启动游戏

服务端与客户端都需要安装（本模组未做单边逻辑分离）。

## 从源码构建

项目由 **MCreator** 生成，也可以用 Gradle 直接构建：

```bash
./gradlew build
```

产物位于 `build/libs/`。

> 在无外网或 GitHub 访问受限的环境中，构建需要配置 Maven 镜像（见 `构建说明.md`）。

## 许可证

本项目基于 MIT 许可证开源，详见 [LICENSE](LICENSE)。

你可以自由使用、修改、再发布，包括商业用途，只需保留原始版权声明。
