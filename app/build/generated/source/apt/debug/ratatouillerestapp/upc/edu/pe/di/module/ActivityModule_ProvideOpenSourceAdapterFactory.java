package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceAdapter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideOpenSourceAdapterFactory
    implements Factory<OpenSourceAdapter> {
  private final ActivityModule module;

  public ActivityModule_ProvideOpenSourceAdapterFactory(ActivityModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OpenSourceAdapter get() {
    return Preconditions.checkNotNull(
        module.provideOpenSourceAdapter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OpenSourceAdapter> create(ActivityModule module) {
    return new ActivityModule_ProvideOpenSourceAdapterFactory(module);
  }

  /** Proxies {@link ActivityModule#provideOpenSourceAdapter()}. */
  public static OpenSourceAdapter proxyProvideOpenSourceAdapter(ActivityModule instance) {
    return instance.provideOpenSourceAdapter();
  }
}
