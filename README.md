# Java Design Patterns

基于 **Java 21** 的 23 种 GoF 设计模式示例代码，涵盖创建型、结构型、行为型三大类别。

## 技术栈

- **Java 21**
- **Maven**

## 项目结构

```
src/main/java/com/hzz/dp/
├── creational/       # 创建型模式（5 种）
├── structural/       # 结构型模式（7 种）
└── behavioral/       # 行为型模式（11 种）
```

每个设计模式独立子包，内含 `*Demo` 主类可直接运行。

## 创建型模式

| # | 模式 | 包名 | 核心思想 |
|---|------|------|----------|
| 1 | **单例模式 (Singleton)** | `creational.singleton` | 确保类只有一个实例，提供全局访问点。5 种实现：饿汉式、懒汉式、DCL、静态内部类、枚举 |
| 2 | **工厂方法模式 (Factory Method)** | `creational.factory` | 父类定义创建接口，子类决定实例化哪个类。解决 `new` 硬编码 |
| 3 | **抽象工厂模式 (Abstract Factory)** | `creational.abstractfactory` | 创建一整套相关产品族（Button + TextField），保证产品一致性 |
| 4 | **建造者模式 (Builder)** | `creational.builder` | 分离复杂对象的构建与表示，链式调用解决构造器参数过多问题 |
| 5 | **原型模式 (Prototype)** | `creational.prototype` | 通过克隆已有对象来创建新实例，避免重复初始化开销 |

## 结构型模式

| # | 模式 | 包名 | 核心思想 |
|---|------|------|----------|
| 6 | **适配器模式 (Adapter)** | `structural.adapter` | 接口转换，让不兼容的类协同工作（MediaAdapter 转接 VLC/MP4） |
| 7 | **桥接模式 (Bridge)** | `structural.bridge` | 用组合代替继承，分离抽象与实现，避免类爆炸 |
| 8 | **组合模式 (Composite)** | `structural.composite` | 树形结构统一叶子与容器，客户端无需区分单个和组合对象 |
| 9 | **装饰器模式 (Decorator)** | `structural.decorator` | 不改变接口的前提下动态添加职责（咖啡加牛奶/糖/奶油） |
| 10 | **外观模式 (Facade)** | `structural.facade` | 为复杂子系统提供统一的高层接口（Computer 一键开机） |
| 11 | **享元模式 (Flyweight)** | `structural.flyweight` | 通过共享细粒度对象减少内存占用（32 个棋子只建 12 个享元） |
| 12 | **代理模式 (Proxy)** | `structural.proxy` | 为其他对象提供代理以控制访问（图片懒加载） |

## 行为型模式

| # | 模式 | 包名 | 核心思想 |
|---|------|------|----------|
| 13 | **责任链模式 (Chain of Responsibility)** | `behavioral.chain` | 多个处理器依次处理请求，直到有处理器处理为止（日志级别链） |
| 14 | **命令模式 (Command)** | `behavioral.command` | 请求封装为对象，支持参数化、队列、撤销（遥控器 + 撤销栈） |
| 15 | **解释器模式 (Interpreter)** | `behavioral.interpreter` | 定义语言的文法表示并解释句子（算术表达式 AST） |
| 16 | **迭代器模式 (Iterator)** | `behavioral.iterator` | 提供统一遍历集合的方式而不暴露内部实现（双向迭代器） |
| 17 | **中介者模式 (Mediator)** | `behavioral.mediator` | 用中介对象协调多个对象交互，星形替代网状依赖 |
| 18 | **备忘录模式 (Memento)** | `behavioral.memento` | 保存对象内部状态并在需要时恢复，不破坏封装（文本撤销） |
| 19 | **观察者模式 (Observer)** | `behavioral.observer` | 一对多依赖，主题状态变化自动通知所有观察者（气象站） |
| 20 | **状态模式 (State)** | `behavioral.state` | 对象状态变化时行为也随之改变（自动售货机 4 种状态） |
| 21 | **策略模式 (Strategy)** | `behavioral.strategy` | 定义一系列算法，封装各自独立并可互相替换（支付方式） |
| 22 | **模板方法模式 (Template Method)** | `behavioral.template` | 父类定义算法骨架，子类重写特定步骤（咖啡/茶制作流程） |
| 23 | **访问者模式 (Visitor)** | `behavioral.visitor` | 在不修改元素类的前提下增加新操作（双重分派：文档导出 HTML/Text） |

## 如何运行

### 方式一：直接在 IDE 中运行

每个模式包下的 `*Demo.java` 都是可执行的 main 入口，在 IDE 中直接运行即可。

### 方式二：Maven 编译后运行

```bash
# 编译
mvn compile

# 以单例模式为例
mvn exec:java -Dexec.mainClass="com.hzz.dp.creational.singleton.SingletonDemo"
```

## 相关资源

- 《Design Patterns: Elements of Reusable Object-Oriented Software》— GoF 四人组
- 《Head First Design Patterns》
