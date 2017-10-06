package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerInteractor;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerMvpInteractor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideCustomerMvpInteractorFactory
    implements Factory<CustomerMvpInteractor> {
  private final ActivityModule module;

  private final Provider<CustomerInteractor> interactorProvider;

  public ActivityModule_ProvideCustomerMvpInteractorFactory(
      ActivityModule module, Provider<CustomerInteractor> interactorProvider) {
    assert module != null;
    this.module = module;
    assert interactorProvider != null;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public CustomerMvpInteractor get() {
    return Preconditions.checkNotNull(
        module.provideCustomerMvpInteractor(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CustomerMvpInteractor> create(
      ActivityModule module, Provider<CustomerInteractor> interactorProvider) {
    return new ActivityModule_ProvideCustomerMvpInteractorFactory(module, interactorProvider);
  }

  /** Proxies {@link ActivityModule#provideCustomerMvpInteractor(CustomerInteractor)}. */
  public static CustomerMvpInteractor proxyProvideCustomerMvpInteractor(
      ActivityModule instance, CustomerInteractor interactor) {
    return instance.provideCustomerMvpInteractor(interactor);
  }
}
