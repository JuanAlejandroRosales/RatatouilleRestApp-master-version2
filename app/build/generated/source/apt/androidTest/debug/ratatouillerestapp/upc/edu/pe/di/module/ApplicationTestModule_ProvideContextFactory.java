package ratatouillerestapp.upc.edu.pe.di.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationTestModule_ProvideContextFactory implements Factory<Context> {
  private final ApplicationTestModule module;

  public ApplicationTestModule_ProvideContextFactory(ApplicationTestModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Context> create(ApplicationTestModule module) {
    return new ApplicationTestModule_ProvideContextFactory(module);
  }

  /** Proxies {@link ApplicationTestModule#provideContext()}. */
  public static Context proxyProvideContext(ApplicationTestModule instance) {
    return instance.provideContext();
  }
}
