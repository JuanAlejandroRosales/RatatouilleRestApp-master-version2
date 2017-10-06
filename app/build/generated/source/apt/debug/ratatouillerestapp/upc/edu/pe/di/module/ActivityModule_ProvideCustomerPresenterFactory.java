package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerMvpView;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerPresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideCustomerPresenterFactory
    implements Factory<CustomerMvpPresenter<CustomerMvpView, CustomerMvpInteractor>> {
  private final ActivityModule module;

  private final Provider<CustomerPresenter<CustomerMvpView, CustomerMvpInteractor>>
      presenterProvider;

  public ActivityModule_ProvideCustomerPresenterFactory(
      ActivityModule module,
      Provider<CustomerPresenter<CustomerMvpView, CustomerMvpInteractor>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public CustomerMvpPresenter<CustomerMvpView, CustomerMvpInteractor> get() {
    return Preconditions.checkNotNull(
        module.provideCustomerPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CustomerMvpPresenter<CustomerMvpView, CustomerMvpInteractor>> create(
      ActivityModule module,
      Provider<CustomerPresenter<CustomerMvpView, CustomerMvpInteractor>> presenterProvider) {
    return new ActivityModule_ProvideCustomerPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideCustomerPresenter(CustomerPresenter)}. */
  public static CustomerMvpPresenter<CustomerMvpView, CustomerMvpInteractor>
      proxyProvideCustomerPresenter(
          ActivityModule instance,
          CustomerPresenter<CustomerMvpView, CustomerMvpInteractor> presenter) {
    return instance.provideCustomerPresenter(presenter);
  }
}
