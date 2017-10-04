package ratatouillerestapp.upc.edu.pe.ui.customer;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomerFragment_MembersInjector implements MembersInjector<CustomerFragment> {
  private final Provider<CustomerMvpPresenter<CustomerMvpView, CustomerMvpInteractor>>
      mPresenterProvider;

  public CustomerFragment_MembersInjector(
      Provider<CustomerMvpPresenter<CustomerMvpView, CustomerMvpInteractor>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<CustomerFragment> create(
      Provider<CustomerMvpPresenter<CustomerMvpView, CustomerMvpInteractor>> mPresenterProvider) {
    return new CustomerFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(CustomerFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      CustomerFragment instance,
      Provider<CustomerMvpPresenter<CustomerMvpView, CustomerMvpInteractor>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
