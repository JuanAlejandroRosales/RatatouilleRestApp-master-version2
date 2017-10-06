package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductMvpView;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductPresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideProductPresenterFactory
    implements Factory<ProductMvpPresenter<ProductMvpView, ProductMvpInteractor>> {
  private final ActivityModule module;

  private final Provider<ProductPresenter<ProductMvpView, ProductMvpInteractor>> presenterProvider;

  public ActivityModule_ProvideProductPresenterFactory(
      ActivityModule module,
      Provider<ProductPresenter<ProductMvpView, ProductMvpInteractor>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public ProductMvpPresenter<ProductMvpView, ProductMvpInteractor> get() {
    return Preconditions.checkNotNull(
        module.provideProductPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProductMvpPresenter<ProductMvpView, ProductMvpInteractor>> create(
      ActivityModule module,
      Provider<ProductPresenter<ProductMvpView, ProductMvpInteractor>> presenterProvider) {
    return new ActivityModule_ProvideProductPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideProductPresenter(ProductPresenter)}. */
  public static ProductMvpPresenter<ProductMvpView, ProductMvpInteractor>
      proxyProvideProductPresenter(
          ActivityModule instance,
          ProductPresenter<ProductMvpView, ProductMvpInteractor> presenter) {
    return instance.provideProductPresenter(presenter);
  }
}
