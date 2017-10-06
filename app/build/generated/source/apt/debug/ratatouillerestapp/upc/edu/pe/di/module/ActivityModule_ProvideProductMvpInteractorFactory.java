package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductInteractor;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductMvpInteractor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideProductMvpInteractorFactory
    implements Factory<ProductMvpInteractor> {
  private final ActivityModule module;

  private final Provider<ProductInteractor> interactorProvider;

  public ActivityModule_ProvideProductMvpInteractorFactory(
      ActivityModule module, Provider<ProductInteractor> interactorProvider) {
    assert module != null;
    this.module = module;
    assert interactorProvider != null;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public ProductMvpInteractor get() {
    return Preconditions.checkNotNull(
        module.provideProductMvpInteractor(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductMvpInteractor> create(
      ActivityModule module, Provider<ProductInteractor> interactorProvider) {
    return new ActivityModule_ProvideProductMvpInteractorFactory(module, interactorProvider);
  }

  /** Proxies {@link ActivityModule#provideProductMvpInteractor(ProductInteractor)}. */
  public static ProductMvpInteractor proxyProvideProductMvpInteractor(
      ActivityModule instance, ProductInteractor interactor) {
    return instance.provideProductMvpInteractor(interactor);
  }
}
