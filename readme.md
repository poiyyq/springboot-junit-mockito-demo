# 写在前面
> 三流的团队做项目，二流的团队做产品，一流的团队做标准
> 
许多技术团队为了敏捷开发，很少关注代码质量、代码稳定性与健壮性，由此导致的后果就是系统上线后，bug频发，引起用户的反感，从而造成商业价值的流失。

为了解决这一现象，我们需要成熟的单元测试工具，测试流程，开发规范等去约束自己。

so~维尼书写✍️以下demo，用来引导大家使用规范化的单元测试

# 技术栈
- springboot
- junit
- mockito

com.winnie.biz.store.service.impl.StoreServiceImplTest 为传统单元测试类
com.winnie.biz.store.service.impl.StoreServiceImplMockitoTest 为Mock单元测试类
